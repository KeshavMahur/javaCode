# API Gateway - Microservices Project

This project is a minimal API Gateway implementation built using Spring Boot and Spring Cloud Gateway as part of a Microservices architecture practice setup.

## Tech Stack

- Java 8
- Spring Boot 2.7.18
- Spring Cloud Gateway
- Eureka Discovery Client
- Spring Cloud Config Client
- Maven

---

# Project Overview

The gateway acts as a single entry point for all client requests and routes traffic to downstream microservices using service discovery.

Currently configured services:

- HOTELSERVICE
- RATINGSERVICE
- USERSERVICE

---

# Configured Routes

| Path | Service |
|------|----------|
| `/hotel/**` | HOTELSERVICE |
| `/rating/**` | RATINGSERVICE |
| `/user/**` | USERSERVICE |

---

# Features

- Centralized API Gateway
- Dynamic routing using Eureka Service Discovery
- Spring Cloud Gateway integration
- Externalized configuration support via Config Server
- Load-balanced routing
- Minimal microservices gateway skeleton for learning purposes

---

# Configuration Details

## Server Port

```properties
server.port=8084
