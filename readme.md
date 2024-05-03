# CrickInformer

## Overview
CrickInformer is a web application designed to provide users with up-to-date cricket information, including live match scores, tournament point tables, and historical match data. It utilizes Spring Boot for the backend services and Angular for the frontend interface.

## Features
- **Live Match Scores**: Provides real-time updates on ongoing matches.
- **CWC 2023 Point Table**: Displays the current point table for the Cricket World Cup 2023.
- **IPL 2024 Point Table**: Displays the current point table for the Indian Premier League 2024.
- **All Matches**: Retrieves information about all matches stored in the database.
- **History Page**: Displays historical match data stored in the database.
- **Home Page**: The landing page with general information about the application.

## Technologies Used
- **Backend**:
  - Spring Boot: Framework for building robust Java applications.
  - JPA: Java Persistence API for managing relational data in applications.
  - SQL: Database language for managing the database.
  - Hibernate: Object-relational mapping framework for Java.
  - JSoup: Java library for web scraping to fetch data from cricbuzz.
- **Frontend**:
  - Angular: Frontend framework for building single-page applications.

## Getting Started
### Prerequisites
- Java Development Kit (JDK)
- Maven
- Node.js
- Angular CLI

### Installation
1. Clone the repository: `git clone <repository-url>`
2. Navigate to the backend directory: `cd backend`
3. Build and run the Spring Boot application: `mvn spring-boot:run`
4. Open a new terminal and navigate to the frontend directory: `cd frontend`
5. Install Angular dependencies: `npm install`
6. Start the Angular development server: `ng serve`

## Usage
1. Access the application in your web browser at `http://localhost:4200`.
2. Navigate through the different pages:
   - **Live**: View live match scores.
   - **Point Table**: View point tables for CWC 2023 and IPL 2024.
   - **History**: View historical match data.
   - **Home**: General information about the application.

