<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
        <h1> <c:out value="Hello ${ person.getFirstName()} ${ person.getLastName()}"/>
        </h1>
    </body>
</html>