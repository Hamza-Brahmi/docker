FROM openjdk:17

WORKDIR /portailRH

COPY ./target/MicroService-0.0.1-SNAPSHOT.jar .

EXPOSE 8090
