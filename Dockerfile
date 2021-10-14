FROM openjdk:8 AS builder
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY build.gradle* settings.gradle* gradle* $APP_HOME
COPY gradle $APP_HOME/gradle
RUN ./gradlew build || return 0
COPY . .
RUN ./gradlew installDist

FROM openjdk:8 AS runner
ENV APP_HOME=/usr/app/
ENV EXECUTABLE_NAME=bar-server
WORKDIR $APP_HOME
COPY --from=builder $APP_HOME/server/build/ .
EXPOSE 50051
CMD ./install/server/bin/$EXECUTABLE_NAME