FROM ubuntu:latest
LABEL authors="user"

FROM openjdk:17.0.2-jdk

WORKDIR /web

COPY target/

ENTRYPOINT ["top", "-b"]