FROM amazoncorretto:17.0.11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} payment_service.jar

ENTRYPOINT ["java", "-jar", "/payment_service.jar"]

EXPOSE 9504