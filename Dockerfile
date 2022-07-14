FROM openjdk:11
ADD target/messages.jar messages.jar
ENTRYPOINT ["java", "-jar","messages.jar"]