FROM openjdk:8-jdk-alpine
MAINTAINER yinan.zhou
COPY target/docker-demo.jar docker-demo-serve.jar
EXPOSE 8085
CMD ["java","-jar","docker-demo-serve.jar"]
