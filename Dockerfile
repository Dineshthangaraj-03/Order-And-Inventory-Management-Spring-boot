# Use OpenJDK
FROM openjdk:17-jdk

# Copy the built JAR file
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose port 8080
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java","-jar","/app.jar"]
