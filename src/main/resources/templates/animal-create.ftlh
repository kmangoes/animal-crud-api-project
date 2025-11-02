<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/css/animal-form-styles.css">
        <meta name ="description" content="This is the webpage for submitting a new animal">
        <meta charset="utf-8">
        <title>'New Animal' Form</title>
    </head>
<body>
<!--Start Nav Bar-->
    <ul class = "navbar">
        <li><a href="/animals/">Home</a></li>
        <li><a href="/animals/createForm/">New Animal Form</a></li>
    </ul>
<!--End Nav Bar-->
    
    <div class = "form">
    <h2>Add a New Animal!</h2>
    <h4>Name</h4>
    <input type="text" id="name" name="name" placeholder="Enter animal name">
    <h4>Classification</h4>
    <input type="text" id="classification" name="classification" placeholder="Enter animal breed">
    <h4>Age</h4>
    <input type="number" id="age" name="age">
    <h4>Image URL</h4>
    <input type="text" id="image" name="image" placeholder="Enter image URL">
    <h4>Description</h4>
    <textarea id="description" name="description" rows="4" cols="50" placeholder="Enter a description..."></textarea>
    <br><br>
    <input type="submit" value="Send">
    </div>

</body>
</html>