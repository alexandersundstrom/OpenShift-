FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/osdocker-1.0-SNAPSHOT.jar
ENV $JAVA_APP_JAR=target/osdocker-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]