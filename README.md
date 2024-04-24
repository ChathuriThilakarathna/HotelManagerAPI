# Hotel Booking API

This is a simple Java-based microservice API for managing hotel bookings. It provides endpoints for storing bookings, finding available rooms on a given date, and retrieving bookings for a specific guest.

## Features
- Store Booking: Endpoint to store a booking with guest name, room number, and date.
- Find Available Rooms: Endpoint to find available rooms for a given date.
- Find Bookings for Guest: Endpoint to find all bookings for a specific guest.

## Prerequisites
- Java Development Kit (JDK) installed on your machine
- Maven or Gradle for building the project
- Git for cloning the repository (optional)

## Installation
1. Clone the repository to your local machine:
```
git clone https://github.com/ChathuriThilakarathna/HotelManagerAPI
```
2. Navigate to the project directory:
```
cd HotelManagerAPI
```
3. Build the project using Maven:
```
mvn clean install
```

## Usage
1. Run the main class HotelBookingApi to start the HTTP server:
```
java -cp target/classes com.devtest.controller.HotelBookingApi
```
2. Use a tool like cURL or Postman to make HTTP requests to the API endpoints:
- Store Booking:
  `POST /bookings`
- Find Available Rooms:
  `GET /available-rooms?date={date}`
- Find Bookings for Guest:
  `GET /bookings-for-guest?guestName={guestName}`

## Example Requests
- Store Booking:
```
curl -X POST -d "guestName=Anna Joe&roomNumber=1&date=2024-04-25" http://localhost:8080/bookings
```
- Store Booking:
```
curl http://localhost:8080/available-rooms?date=2024-04-25
```
- Find Bookings for Guest:
```
curl http://localhost:8080/bookings-for-guest?guestName=Anna%20Joe
```
