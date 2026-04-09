# Use official OpenJDK 17 image
FROM eclipse-temurin:17-jdk

# Copy the built JAR
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose default Spring Boot port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java","-jar","/app.jar"]
