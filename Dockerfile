FROM openjdk:11
ENV APP_HOME=/usr/app
WORKDIR $APP_HOME

COPY build/libs/*.jar application.jar
CMD ["java", "-jar", "application.jar"]