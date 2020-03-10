FROM openjdk:11
ADD target/account-application-0.0.1-SNAPSHOT.jar account-application.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","account-application.jar"]