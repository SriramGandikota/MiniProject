FROM maven:latest
WORKDIR /build
COPY pom.xml .
COPY src/ /build/src/
RUN mvn install


FROM openjdk:latest
COPY target/CalculatorDevOps-1.0-SNAPSHOT.jar ./
CMD ["java","-cp","CalculatorDevOps-1.0-SNAPSHOT.jar","App"]

