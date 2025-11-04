<!--COMPLETE :D-->
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="../css/animal-list-styles.css">
        <meta name ="description" content="This is a MVC web app for CSC340">
        <meta charset="utf-8">
        <title>MVC Web App</title>
    </head>
<body>
<!--Start Nav Bar-->
    <ul class = "navbar">
        <li><a href="/animals/">Home</a></li>
        <li><a href="/animals/createForm">New Animal Form</a></li>
    </ul>
    <h1>Welcome to the Animal Gallery!</h1>
    <h4>A collection of cute animals <br><br></h4>
<!--End Nav Bar-->

<!--Start Animals Cards-->
    <#list animalsList as animal> <!--loop through all animal rows in database-->
    <div class="animal-card">
        <p><strong>Name:</strong> ${animal.name}</p>
        <p><strong>Age:</strong> ${animal.age}</p>
        <p><strong>Classification:</strong> ${animal.classification}</p>

        <div class="actions">
            <button onclick="window.location.href='/animals/${animal.animalId}'">Details</button>
            <button onclick="window.location.href='/animals/updateForm/${animal.animalId}'">Update</button>
            <button onclick="window.location.href='/animals/delete/${animal.animalId}'">Delete</button>
        </div>
    </div>
    </#list> <!--end of loop-->
<!--End Animals Cards-->
</body>
</html>