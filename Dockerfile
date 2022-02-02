FROM openjdk:8
ADD target/PatientModule.jar PatientModule.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","PatientModule.jar"]