FROM openjdk:11

WORKDIR . /usr/src/main

COPY target/*.jar /main/app.jar

EXPOSE 8080

CMD java -XX:+UseContainerSupport -Xmx512m -jar app.jar --server.port=$PORT
