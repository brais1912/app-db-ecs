FROM openjdk:17-jdk-slim
EXPOSE 8080
WORKDIR /opt/app
ARG JAR_FILE=target/app-db-ecs-0.0.1-SNAPSHOT.jar

# cp spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]