# Use the official OpenJDK 17 image as the base image
FROM openjdk:17

# Expose port 4445 to allow communication to/from the container
EXPOSE 4445

EXPOSE ${DOCKER_EXPOSE_PORT}

#Packaged JAR file into the container at /target
ADD target/SpringDockerKubernatesExample-0.0.1-SNAPSHOT.jar SpringDockerKubernatesExample-0.0.1-SNAPSHOT.jar

# Specify the command to run your application
ENTRYPOINT ["java","-jar","/SpringDockerKubernatesExample-0.0.1-SNAPSHOT.jar"]