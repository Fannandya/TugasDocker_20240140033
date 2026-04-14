
# Menggunakan base image Java 25 sesuai spek project
FROM eclipse-temurin:25-jdk

# Mendefinisikan argumen untuk lokasi file .jar di folder target
ARG JAR_FILE=target/*.jar

# Menyalin file .jar dari laptop ke dalam container dengan nama app.jar
COPY target/deploy-0.0.1-SNAPSHOT.jar /app.jar

# Perintah untuk menjalankan aplikasi Spring Boot saat container nyala
ENTRYPOINT ["java", "-jar", "/app.jar"]

# Menandai bahwa aplikasi berjalan di port 8080
EXPOSE 8080