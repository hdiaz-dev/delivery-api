# Delivery API 

REST API for delivery management system built with Java, Spring Boot and PostgreSQL.

## Technologies

- Java 21
- Spring Boot 3.5
- PostgreSQL 16
- Docker & Docker Compose
- JPA / Hibernate
- Maven

## Features

- Customer management with multiple addresses
- Order management with real-time tracking
- Payment integration ready (Stripe)
- Automatic auditing (created by, modified by, timestamps)
- Native SQL queries with PostgreSQL

## Requirements

- Docker
- Docker Compose

## How to run

1. Clone the repository
2. Copy the example properties file:
   cp src/main/resources/application.properties.example 
   src/main/resources/application.properties
3. Start with Docker:
   docker-compose up --build

API will be available at: http://localhost:8081

## Project Structure

src/
├── controller/    # REST endpoints
├── model/         # JPA entities
├── repository/    # Data access layer
└── service/       # Business logic

## Status

🚧 In active development
