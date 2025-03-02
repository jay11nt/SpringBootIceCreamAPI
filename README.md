# SpringBootIceCreamAPI
project with many-to-many bidirectional mapping relationships.

1. Project Structure

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
