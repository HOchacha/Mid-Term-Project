FROM ubuntu:22.04

RUN apt-get update

RUN apt-get -y install openjdk-17-jdk

RUN echo "export JAVA_HOME=$(readlink -f /usr/bin/java | sed 's:bin/java::')" >> /etc/bash.bashrc

WORKDIR /web

COPY ./ /web

RUN chmod +x ./gradlew

RUN ./gradlew build --exclude-task test
 
ENTRYPOINT ["java", "-jar", "./build/libs/mt_Web_Mono_Server-0.0.1-SNAPSHOT.jar"]



