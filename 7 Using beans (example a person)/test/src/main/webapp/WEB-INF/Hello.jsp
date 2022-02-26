<%@ page pageEncoding= "UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
        <h1>Hello ${ person.getFirstName()} ${ person.getLastName()}
        </h1>
        <h2>
        	${person.getAge() >= 18 ? "you are an adult" : "you are not an adult"}
        </h2>
    </body>
</html>