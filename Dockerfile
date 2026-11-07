FROM eclipse-temurin:21-jre-alpine

WORKDIR /app

# Copiamos el .jar compilado por Maven en GitHub Actions
COPY target/mi-backend.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]

