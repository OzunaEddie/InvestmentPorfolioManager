FROM maven:3.6.3-openjdk-11 AS maven
COPY . /usr/src/mymaven
WORKDIR /usr/src/mymaven
RUN mvn -Dmaven.test.skip=true clean install

FROM openjdk:11
RUN wget https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-java_8.0.24-1debian9_all.deb -O /tmp/mysql-connector.deb
RUN dpkg -i /tmp/mysql-connector.deb
COPY --from=maven /usr/src/mymaven/target/InvestmentManager-0.0.1-SNAPSHOT.jar app.jar
COPY src/main/resources/application-docker.properties application.properties
EXPOSE 8081
ENTRYPOINT [ "sh", "-c",  "java -jar -Dserver.port=8081 /app.jar" ]

