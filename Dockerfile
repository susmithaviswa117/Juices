# Step 1: Build using Maven
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# Step 2: Run app
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENV PORT=8080
EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]