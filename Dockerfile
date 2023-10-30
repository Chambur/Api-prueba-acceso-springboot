#Java 11
FROM adoptopenjdk:11-jre-hotspot

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copy to the workdir
COPY prueba_acceso/target/prueba_acceso-0.0.1-SNAPSHOT.jar /app/prueba_acceso-0.0.1-SNAPSHOT.jar

# Port 8080
EXPOSE 8080

# Exec
CMD ["java", "-jar", "prueba_acceso-0.0.1-SNAPSHOT.jar"]
