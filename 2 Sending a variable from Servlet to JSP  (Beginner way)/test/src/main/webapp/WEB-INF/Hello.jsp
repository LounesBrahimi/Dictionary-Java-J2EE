<%@ page pageEncoding= "UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
        <p>Hello World !!</p>
        <p>
        	<%
        		String var = (String) request.getAttribute("var");
        		out.println(var);
        	%>
        </p>
    </body>
</html>