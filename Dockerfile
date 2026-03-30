# Step 1: Build using Maven
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# Step 2: Run app
FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app

# ✅ Use exact JAR name (VERY IMPORTANT)
COPY --from=build /app/target/juices2-0.0.1-SNAPSHOT.jar app.jar

# Railway dynamic port
ENV PORT=8080

EXPOSE 8080

ENTRYPOINT ["sh","-c","java -jar app.jar --server.port=$PORT"]