<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
    	<h3>My Machines : </h3>
    	<c:forEach items="${machines}" var="machine" varStatus="status">
    		<p>
    			N°<c:out value="${status.count}"></c:out> : <c:out value="${machine}"></c:out>
    		</p>
    	</c:forEach>
    </body>
</html>