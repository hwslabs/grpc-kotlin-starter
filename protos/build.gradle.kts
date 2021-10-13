// Note: We use the java-library plugin to get the protos into the artifact for this subproject
// because there doesn't seem to be a better way.
plugins {
    `java-library`
}

java {
    sourceSets.getByName("main").resources.srcDir("src/main/proto")
}
