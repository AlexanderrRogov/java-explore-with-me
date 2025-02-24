# Этап сборки
FROM maven:3.9.5-openjdk-21 AS build
COPY src /app/src
COPY pom.xml /app
RUN mvn -f /app/pom.xml clean package

# Этап запуска
FROM amazoncorretto:21
COPY --from=build /app/target/stat-server.jar /stat-server.jar
ENTRYPOINT ["java", "-jar", "/stat-server.jar"]

#FROM amazoncorretto:21
#COPY target/stat-server.jar stat-server.jar
#ENTRYPOINT ["java","-jar","/stat-server.jar"]