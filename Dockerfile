# Imagen base con Java 21
FROM eclipse-temurin:21-jdk-alpine

# Carpeta de trabajo dentro del contenedor
WORKDIR /app

# Copia el pom.xml primero para aprovechar cache
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Descarga dependencias
RUN ./mvnw dependency:go-offline

# Copia el código fuente
COPY src src

# Compila y empaqueta
RUN ./mvnw package -DskipTests

# Puerto que expone la app
EXPOSE 8081

# Comando para arrancar
CMD ["java", "-jar", "target/delivery-api-0.0.1-SNAPSHOT.jar"]
