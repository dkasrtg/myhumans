#
# Build stage
#
FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN ./mvnw clean package 

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /target/myhumans-0.0.1-SNAPSHOT.jar myhumans.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","myhumans.jar"]