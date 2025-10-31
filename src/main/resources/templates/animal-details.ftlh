<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/css/animal-details-styles.css"> 
        <meta name ="description" content="This is the details page for the Static Web App">
        <meta charset="utf-8">
        <title>Details Page</title>
    </head>
    <body>
    <ul class = "navbar">
        <li><a href="/animals">Home</a></li>
        <li><a href="/animals/createForm">New Animal Form</a></li>
        <li><a href="/animals/updateForm/${animal.animalId}">Update Form</a></li> <!--both this link and details link in navbar will be abstracted to other places; will not be in navbar in final ver.-->
        <li><a href="/animals/${animal.animalId}">Details</a></li> <!--the details LINK in navbar will be replaced by hyperlinks on each animal's card in animal-list page-->
    </ul>
    <h1>${animal.name}</h1>
    <div class="animal-text-box">
        <img src="${animal.animalPicturePath}" alt="${animal.name}" width="600" height="400">
        <h2> Description </h2>
        <p> ${animal.description}</p>
        <ul class ="animal-facts">
            <li>Age: ${animal.age}</li>
            <li>Breed: ${animal.classification}</li>
        </ul>
    </div>
    </body>
</html>