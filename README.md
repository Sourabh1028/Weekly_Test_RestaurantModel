# Weekly_Test_RestaurantModel
This project is a Restaurant model, built using Spring Boot with Java.

## Framework Used
* Spring Boot

---

## Language Used
* Java
---

## Data Flow

```
The user sends a request to the application through the API endpoints.
```
```
The API receives the request and sends it to the appropriate controller method.
```
```
The controller method makes a call to the method in service class.
```
```
The method in service class builds logic and retrieves or modifies data, which is in turn given to controller class
```
```
The controller method returns a response to the API.
```
```
The API sends the response back to the user.
```

---

## Functions used :-

### API Endpoints :-

* GetMapping: "/getById/{id}"
```
This endpoint gives us the data of all Restaurant stored in our data base.
```

---

* PostMapping: "/addResto"
```
In database we add a new Restaurant given through API.
```

---

* DeleteMapping: "/removeRestoById/{id}"
```
In database we delete a Restaurant by id given through API.
```

---

* PutMapping: "/updateResto/{id}"
```
In database we update a Restaurant by id given through API.
```

---

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement CRUD Operations 
```
---

## Project Summary
The Restaurant model is a Spring Boot project written in Java that enables basic functionality for managing users. This project is built using the Spring Boot framework. The project uses ArrayList as the data structure to store and manage user data.

The project includes four main components, the RestoController, the RestoService, the RestoDao, and the Restaurant class. The RestoController class receives requests from the user interface layer and delegates them to the RestoService. The RestoService processes the request and retrieves or updates data from the RestoDao. The RestoDao uses an ArrayList data structure to store and manage user data, and the Restaurant class defines the Restaurant data model.
