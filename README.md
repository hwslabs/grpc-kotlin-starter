# gRPC Kotlin starter

Hypto                  |gRPC                   |Kotlin
:---------------------:|:---------------------:|:---------------------:|
![](logo/Hypto.png)    |![](logo/gRPC.png)     |![](logo/Kotlin.png)

## Overview

This directory contains a simple bar service written as a Kotlin gRPC example. 
You can find detailed instructions for building and running example from below

- **Bar Service** using gRPC and Kotlin. For details, see the [project on github](https://gitlab.com/hwslabs/grpc-kotlin-starter).

## File organization

The starter sources are organized into the following top-level folders:

- [protos](protos): `.proto` files for generating the stubs
- [stub](stub): regular Java & Kotlin stub artifacts from [protos][]
- [server](server): Kotlin servers based on regular [stub][] artifacts
- [client](client): Kotlin clients based on regular [stub][] artifacts

## Set up and run the starter on macOS

- <details>
  <summary>Install Homebrew</summary>

  Download and install Homebrew:

  ```sh
  /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
  ```

- <details>
  <summary>Install JDK</summary>

  Install any version of JDK (8 preferred):

  ```sh
  brew install openjdk@8
  ```

  Add the installed version of JDK to your path through .zshrc or .bash_profile

  ```sh
  echo 'export PATH="/usr/local/opt/openjdk@8/bin:$PATH"' >> ~/.zshrc
  source ~/.zshrc
  ```

  or

  ```sh
  echo 'export PATH="/usr/local/opt/openjdk@8/bin:$PATH"' >> ~/.bash_profile
  source ~/.bash_profile
  ```

- <details>
  <summary>Clone the project and run the bar service and client starter</summary>

  Clone and navigate into the project:

  ```sh
  git clone https://github.com/hwslabs/grpc-kotlin-starter.git
  cd grpc-kotlin-starter
  ```

  Start the server:

  ```sh
  ./gradlew :server:BarServer
  ```

  In another console, run the client which will make requests to the server:

  ```sh
  ./gradlew :client:BarClient
  ```

[grpc.io Kotlin/JVM]: https://grpc.io/docs/languages/kotlin/
[Quick start]: https://grpc.io/docs/languages/kotlin/quickstart/
[Basics tutorial]: https://grpc.io/docs/languages/kotlin/basics/
[protos]: protos
[stub]: stub
