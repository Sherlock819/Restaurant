# Use an official openjdk runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY target/Restaurant-0.0.1-SNAPSHOT.jar /app/restaurant.jar

# Run the application
ENTRYPOINT ["java", "-jar", "restaurant.jar"]