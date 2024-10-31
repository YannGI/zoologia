FROM openjdk:17-jdk-slim as build

MAINTAINER YannGI.COM

COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPCHOT.jar

ENTRYPOINT ["java", "-jar", "/configserver-0.0.1-SNAPCHOT.jar"]