# SpringBootIceCreamAPI
project with many-to-many bidirectional mapping relationships.


# Ice Cream Shop API

A Spring Boot REST API for managing ice cream products in an ice cream shop.

## Features

- Create, read, update, and delete ice cream products
- Manage ice cream flavors, types, and toppings
- RESTful API endpoints for easy integration

## Technologies

- Java 17
- Spring Boot 3.2
- Spring Data JPA
- H2 Database (can be configured for production databases)
- Maven

## Project Structure

```
src/
├── main/
│    ├── java/
│    │    └── com/
│    │         └── icecreamshop/
│    │             ├── controller/
│    │             │     └── IceCreamController.java
│    │             ├── entity/
│    │             │     ├── IceCream.java
│    │             │     ├── Topping.java
│    │             │     └── IceCreamType.java
│    │             ├── repository/
│    │             │     ├── IceCreamRepository.java
│    │             │     └── ToppingRepository.java
│    │             ├── service/
│    │             │     ├── IceCreamService.java
│    │             │     └── IceCreamServiceImpl.java
│    │             └── IceCreamShopApplication.java
│    └── resources/
│         └── application.properties
```

## API Endpoints

| Method | URL | Description |
|--------|-----|-------------|
| GET    | /api/icecreams | Get all ice creams |
| GET    | /api/icecreams/{id} | Get ice cream by ID |
| POST   | /api/icecreams | Create new ice cream |
| PUT    | /api/icecreams/{id} | Update ice cream |
| DELETE | /api/icecreams/{id} | Delete ice cream |

## Setup and Running

### Prerequisites
- Java 17 or higher
- Maven

### Steps
1. Clone the repository
   ```
   git clone https://github.com/yourusername/ice-cream-shop.git
   cd ice-cream-shop
   ```

2. Build the project
   ```
   mvn clean install
   ```

3. Run the application
   ```
   mvn spring-boot:run
   ```

4. Access the API at http://localhost:8080/api/icecreams

## Sample Request/Response

### Create Ice Cream

**Request:**

POST /api/icecreams
Content-Type: application/json

```
{
  "name": "Chocolate Delight",
  "price": 5.99,
  "description": "Rich chocolate ice cream with chocolate chips",
  "type": {
    "name": "PREMIUM"
  },
  "toppings": [
    {
      "name": "Chocolate Chips"
    },
    {
      "name": "Whipped Cream"
    }
  ]
}
```

**Response:**
```
{
  "id": 1,
  "name": "Chocolate Delight",
  "price": 5.99,
  "description": "Rich chocolate ice cream with chocolate chips",
  "type": {
    "id": 1,
    "name": "PREMIUM"
  },
  "toppings": [
    {
      "id": 1,
      "name": "Chocolate Chips"
    },
    {
      "id": 2,
      "name": "Whipped Cream"
    }
  ]
}
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
