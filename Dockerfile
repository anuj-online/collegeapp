FROM openjdk:21-slim-buster
COPY jar/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
