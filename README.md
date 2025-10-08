# animal-crud-api-project
Animal CRUD API for CSC-340.

## Installation  
- Get the project
    - clone
        ```
      git clone https://github.com/kmangoes/animal-crud-api-project.git
        ```
    - OR download zip
 - This project is build to run on JDK 21
 - open in vsCode
 - **Dependencies:** JPA and PostgresSQL

 - [`/src/main/resources/application.properties`](https://github.com/csc340-uncg/f25-jpa-crud-api/blob/6b2860c4ad01ca46b6b62852ca966bfadc8dfc6a/src/main/resources/application.properties) This file has the configuration for the PostgreSQL database to use for the API.
  - You MUST have the database up and running before running the project!
    - Login to your neon.tech account.
    - Locate your database project.
    - On the project dashboard, click on "Connect" and select Java.
    - Copy the connection string provided.
    - Paste it as a value for the property `spring.datasource.url`. No quotation marks.
- Build and run the main class. You should see a new table created in the Neon database.
  
## API Endpoints  

Base URL: http://localhost:8080/animals
#### 1. /animals **(GET)**
Gets a list of all animals in the database.  
**Response: JSON array of all animal objects**
```
[
  {
    "animalId": 1,
    "name": "benny",
    "description": "chihuahua",
    "age": 3.0,
    "classification": "dog"
  },
  {
    "animalId": 2,
    "name": "beau",
    "description": "mix-breed",
    "age": 12.0,
    "classification": "dog"
  },
  {
    "animalId": 3,
    "name": "beep",
    "description": "fox",
    "age": 4.0,
    "classification": "dog"
  },
  {
    "animalId": 4,
    "name": "boo",
    "description": "raccoon",
    "age": 2.5,
    "classification": "mammal"
  }
]
```

#### 2. /{animalId} **(GET)**  
Gets an animal by its unique, numeric ID.  
**Parameters:** Path variable, **Long** animalId (REQUIRED)  
**Response: A single JSON animal object**  
```
  {
    "animalId": 1,
    "name": "benny",
    "description": "chihuahua",
    "age": 3.0,
    "classification": "dog"
  }
```

#### 3. /{classification} **(GET)**  
Gets a list of animals of a certain classification.  
**Parameters:** Path variable, **String** classification (REQUIRED)  
**Response: JSON array of animals of a certain classification**  
```
[
  {
    "animalId": 1,
    "name": "benny",
    "description": "chihuahua",
    "age": 3.0,
    "classification": "dog"
  },
  {
    "animalId": 2,
    "name": "beau",
    "description": "mix-breed",
    "age": 12.0,
    "classification": "dog"
  }
]
```

#### 4. /name **(GET)**  
Gets an animal by its name. 
**Parameters:** Request param, **String** name (REQUIRED)  
**Response: A single JSON animal object**  
```
[
  {
    "animalId": 1,
    "name": "benny",
    "description": "chihuahua",
    "age": 3.0,
    "classification": "dog"
  }
]
```

#### 5. /animals **(POST)**  
Adds a new animal entry.  
**Parameters:** Request (JSON) body  
**Request Body: animalId unincluded**
```
{
  "name":"boo",
  "description":"raccoon",
  "age": 2.5,
  "classification":"mammal"
}
```
**Response: New JSON entry**  
```
{
  "animalId": 4,
  "name": "boo",
  "description": "raccoon",
  "age": 2.5,
  "classification": "mammal"
}
```

#### 6. /{animalId} **(PUT)** 
Updates an existing animal entry. 
**Parameters:** Path variable, Request (JSON) body  
**Request Body: animalId unincluded**
```
{
  "name":"boo",
  "description":"raccoon",
  "age": 3.5,
  "classification":"mammal"
}
```
**Response: Updated JSON entry**
```
{
  "animalId":4,
  "name":"boo",
  "description":"raccoon",
  "age": 3.5,
  "classification":"mammal"
}
```

#### 7. /{animalId} **(DELETE)**
Deletes an existing animal entry.
**Parameters:** Path variable, **Long** animalId
**Response: Updated body of entries**
```
[
  {
    "animalId": 1,
    "name": "benny",
    "description": "chihuahua",
    "age": 3.0,
    "classification": "dog"
  },
  {
    "animalId": 2,
    "name": "beau",
    "description": "mix-breed",
    "age": 12.0,
    "classification": "dog"
  },
  {
    "animalId": 4,
    "name": "boo",
    "description": "raccoon",
    "age": 2.5,
    "classification": "mammal"
  }
]
```
