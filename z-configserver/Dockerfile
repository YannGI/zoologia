
FROM openjdk:17-jdk-slim as build

MAINTAINER YannGI.COM

COPY target/z-configserver-0.0.1-SNAPSHOT.jar z-configserver-0.0.1-SNAPCHOT.jar

ENTRYPOINT ["java", "-jar", "/z-configserver-0.0.1-SNAPCHOT.jar"]