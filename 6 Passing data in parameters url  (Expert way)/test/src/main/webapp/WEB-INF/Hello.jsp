<%@ page pageEncoding= "UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
        <h1>Hello ${ empty name ? '' : name}
        </h1>
    </body>
</html>