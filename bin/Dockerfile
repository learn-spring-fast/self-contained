FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY target/roshambo-1.0.jar app.jar

ENTRYPOINT ["java","-jar", "/app.jar"]
