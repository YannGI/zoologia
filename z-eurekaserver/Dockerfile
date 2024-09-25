
FROM openjdk:17-jdk-slim as build

MAINTAINER YannGI.COM

COPY target/z-eurekaserver-0.0.1-SNAPSHOT.jar z-eurekaserver-0.0.1-SNAPCHOT.jar

ENTRYPOINT ["java", "-jar", "/z-eurekaserver-0.0.1-SNAPCHOT.jar"]