<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../css/animal-details-styles.css"> 
        <meta name ="description" content="This is the details page for the Static Web App">
        <meta charset="utf-8">
        <title>Details Page</title>
    </head>
    <body>
    <ul class = "navbar">
        <li><a href="animal-list.ftlh">Home</a></li>
        <li><a href="animal-create.ftlh">New Animal Form</a></li>
        <li><a href="animal-update.ftlh">Update Form</a></li>
        <li><a href="animal-details.ftlh">Details</a></li>
    </ul>
    <h1>${animal.name}</h1>
    <div class="animal-text-box">
        <img src="../img/benny.jpg" alt="Benny the Chihuahua" width="600" height="400">
        <h2> Description </h2>
        <p> ${animal.description}</p>
        <ul class ="animal-facts">
            <li>Age: ${animal.age}</li>
            <li>Breed: ${animal.classification}</li>
        </ul>
    </div>
    </body>
</html>