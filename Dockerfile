FROM maven:3.6.3-openjdk-11 AS maven
COPY . /usr/src/mymaven
WORKDIR /usr/src/mymaven
RUN mvn clean package

FROM openjdk:11
COPY --from=maven /usr/src/mymaven/target/* app.jar
EXPOSE 8081
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]