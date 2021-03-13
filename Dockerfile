FROM openjdk:latest
COPY target/CalculatorDevOps-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","CalculatorDevOps-1.0-SNAPSHOT.jar"]

