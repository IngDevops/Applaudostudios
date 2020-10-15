FROM openjdk:8-jre-alpine
EXPOSE 8090
WORKDIR /app
COPY target/renta-video-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "renta-video-0.0.1-SNAPSHOT.jar" ]
