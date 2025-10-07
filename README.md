# animal-crud-api-project
Animal CRUD API for CSC-340.

## Installation  
- Get the project
    - clone
        ```
      git clone https://github.com/kmangoes/animal-crud-api.git
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

#### 2. /{animalId} **(GET)**  
Gets an animal by its unique, numeric ID.  
**Parameters:** Path variable, **Long** animalId (REQUIRED)  
**Response: A single JSON animal object**  

#### 3. /{classification} **(GET)**  
Gets a list of animals of a certain classification.  
**Parameters:** Path variable, **String** classification (REQUIRED)  
**Response: JSON array of animals of a certain classification**  

#### 4. /name **(GET)**  
Gets an animal by its name. 
**Parameters:** Request param, **String** name (REQUIRED)  
**Response: A single JSON animal object**  

#### 5. /animals **(POST)**  
Adds a new animal entry.  
**Parameters:** Request (JSON) body, *without* animalId input  
**Response: New JSON entry**  

#### 6. /{animalId} **(PUT)** 
Updates an existing animal entry. 
**Parameters:** Path variable, Request (JSON) body  

#### 7. /{animalId} **(DELETE)**
Deletes an existing animal entry.
**Parameters:** Path variable, **Long** animalId
