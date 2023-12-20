FROM dvmarques/openjdk-17-jdk-alpine-with-timezone
LABEL authors="cherhy"

ARG JAR_FILE=build/libs/gpt-interview-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} iterview.jar

ENV PROFILE dev

ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar", "/iterview.jar"]
