<%@ page pageEncoding= "UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
        <h1>Hello 
        	<%
        		String name = (String) request.getAttribute("name");
        		out.println(name);
        	%>
        </h1>
    </body>
</html>