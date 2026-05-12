# Tarot Web App

A simple web application for interactive Tarot readings. Built as a pet project / university lab to practice Spring Boot and frontend technologies.

## Features
* **Interactive Spreads:** Users can select a spread type and draw random cards. The shuffling logic (Fisher-Yates algorithm) is implemented on the client side.
* **Database Seeding:** Contains all 78 Tarot cards with descriptions and images. The PostgreSQL database is seeded automatically on application startup.
* **REST API:** The backend serves card and spread data via JSON endpoints (`/api/cards`, `/api/spreads`).
* **Daily Card:** Automatically displays a card of the day.

## Tech Stack
* **Backend:** Java 17, Spring Boot, Spring Data JPA, PostgreSQL
* **Frontend:** HTML, CSS, JavaScript
