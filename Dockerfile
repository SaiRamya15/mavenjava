# Use OpenJDK base image
FROM openjdk:17

# Copy JAR file into container
COPY target/maven-github-jenkins-1.0-SNAPSHOT.jar /app.jar

# Run application
CMD ["java", "-jar", "/app.jar"]
