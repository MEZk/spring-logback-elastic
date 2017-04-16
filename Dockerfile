FROM openjdk:jre-alpine

COPY ./build/libs/spring-boot-*.jar /tmp/testapp/app.jar

EXPOSE 8080

CMD ["java", "-jar", "/tmp/testapp/app.jar"]