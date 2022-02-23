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
        	Today is your birthday you are
          	<%
        		String age = (String) request.getAttribute("age");
        		out.println(age);
        	%>      	
        	years old 
        </h1>
    </body>
</html>