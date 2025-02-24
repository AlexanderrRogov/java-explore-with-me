# Этап сборки
FROM maven:3.9.5-openjdk-21 AS build
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

# Этап запуска
FROM amazoncorretto:21
COPY --from=build /app/target/emw-main-service.jar /emw-main-service.jar
ENTRYPOINT ["java", "-jar", "/emw-main-service.jar"]





#FROM amazoncorretto:21
#COPY target/ewm-main-service.jar emw-main-service.jar
#ENTRYPOINT ["java","-jar","/emw-main-service.jar"]