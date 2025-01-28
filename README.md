# Chat Application Backend

## Overview

This repository contains the backend for a chat application built with Java Spring Boot. It handles real-time messaging
through WebSockets and provides REST APIs for chat functionalities.

## Connecting Frontend

Ensure the frontend application is configured to connect to the correct WebSocket URL and REST endpoints provided by
this backend. Refer to the frontend setup instructions
here: [Chat App Frontend](https://github.com/themane04/chat_fe/tree/dev).

## Features

- Real-time WebSocket communication.
- REST APIs for health check and messaging functionalities.

## Project Structure

- **config**:
    - `SecurityConfig.java`: Configures security settings for the application.
    - `WebSocketConfig.java`: Sets up WebSocket communication.
- **model**:
    - `Message.java`: Represents the message object model.
- **web/rest**:
    - `ChatController.java`: Controller for handling chat messages.
    - `HealthCheckController.java`: Provides a health check API.
- **ChatApplication.java**: Main application class that launches the Spring Boot application.

## Setup

To run this application, follow these steps:

1. Ensure you have Java JDK and Maven installed on your machine.
2. Clone the repository:

```
git clone https://github.com/themane04/chat_be_demo.git
```

3. Navigate to the project directory

```
cd chat_be
```

4. Compile and package the application using Maven
5. Run the application

