# Use official Java 17 image
FROM eclipse-temurin:17-jdk-alpine

# Create app directory
WORKDIR /app

# Copy built jar file
COPY target/*.jar ecommerce-0.0.1-SNAPSHOT.jar

# Set entry point
ENTRYPOINT ["java", "-jar", "/app/ecommerce-0.0.1-SNAPSHOT.jar]
