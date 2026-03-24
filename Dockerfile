# Use Java 21 (stable for Spring Boot)
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy built jar file
COPY target/juices-0.0.1-SNAPSHOT.jar app.jar

# Railway uses dynamic port
ENV PORT=8080
EXPOSE 8080

# Run Spring Boot app
ENTRYPOINT ["java","-jar","app.jar"]