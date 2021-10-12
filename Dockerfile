FROM openjdk:15
COPY target/demo  /demo
WORKDIR /demo
ENTRYPOINT  "./bin/demo"