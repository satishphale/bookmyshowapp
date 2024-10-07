# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Spring Boot jar file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot app listens on
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
