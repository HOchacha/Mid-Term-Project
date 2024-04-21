FROM openjdk:17-jdk-slim

RUN apt update && apt install -y xargs

WORKDIR /web

COPY ./ /web

RUN ./gradlew build --exclude-task test
 
ENTRYPOINT ["java", "-jar", "./build/lib/mt_Web_Mono_Server-0.0.1-SNAPSHOT.jar"]
