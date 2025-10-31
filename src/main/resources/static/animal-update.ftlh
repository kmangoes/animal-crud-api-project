<!DOCTYPE html>
<html>
    <head>
        <meta name ="about" content="This is a page for extra content of the webpage">
        <meta charset="utf-8">
        <link rel="stylesheet" href="../css/animal-update-styles.css">
        <title>About Page</title>
    </head>
<body>
    <ul class = "navbar">
        <li><a href="animal-list.ftlh">Home</a></li>
        <li><a href="animal-create.ftlh">New Animal Form</a></li>
        <li><a href="animal-update.ftlh">Update Form</a></li>
        <li><a href="animal-details.ftlh">Details</a></li>
    </ul>
    <div class = "form">
        <h2>Update Animal Form</h2>
        <h4>Name</h4>
        <input type="text" id="name" name="name" placeholder="Name of animal">
        <h4>Age</h4>
        <input type="number" id="age" name="age" placeholder="Enter animal age">
        <h4>Classification</h4>
        <input type="text" id="classification" name="classification" placeholder="Enter classification of animal">
        <h4>Description</h4>      
        <textarea id="description" name="description" rows="4" cols="50" placeholder="Enter a description..."></textarea>
        <br><br>
        <input type="submit" value="Send">
    </div>
</body>
</html>