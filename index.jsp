<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home Page</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

    <center>
    <br><br>
    <h1>Text Encrypt Decrypt</h1>
    

    <form action="/EncryptDecrypt" method="post">

        <input  class="inputtext" type="text" name="text" placeholder="Enter Text" required> <br>

        <select class="options" name="option" required>

            <option value="Encrypt">Encrypt</option>
            <option value="Decrypt">Decrypt</option>
        </select> <br>

        <input class="submit" type="submit" value="submit">

    </form>

    </center>
</body>
</html>