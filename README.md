# 🌱 Spring Boot Profiles - Environment-Specific Configuration

Welcome to the **Spring Boot Profiles** project! This repository demonstrates how to use **Spring Profiles** to create flexible, environment-specific configurations (e.g., dev, staging, prod) in a Spring Boot application. It's a must-know concept for any Java backend developer building enterprise applications.

---

## 🚀 What are Spring Profiles?

Spring Profiles provide a way to segregate parts of your application configuration and make it only available in certain environments. For example:

- `application-dev.properties` for local development
- `application-prod.properties` for production
- `application-staging.properties` for testing environments

This ensures cleaner configuration management, reduced human error, and makes your application environment-aware.

---

## 📁 Project Structure

```
spring-profiles/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/piecebyte/
│   │   │       └── SpringProfilesApplication.java
│   │   └── resources/
│   │       ├── application.properties           # Default settings
│   │       ├── application-dev.properties       # Dev profile
│   │       ├── application-prod.properties      # Prod profile
│   │       └── application-staging.properties   # Staging profile
│   └── test/...
│
├── pom.xml
└── README.md
