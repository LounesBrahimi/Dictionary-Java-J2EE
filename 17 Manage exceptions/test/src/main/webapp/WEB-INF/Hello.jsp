<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
    	<c:if test="${ !empty error }">
    		<p style="color:red;" ><c:out value="${ error }" />
    		</p>
    	</c:if>
    	<form method="post" action="hello">
        	<p>
            	<label for="firstName">First Name : </label>
            	<input type="text" name="firstName" id="firstName" />
       		</p>
        	<p>
            	<label for="lastName">Last Name : </label>
            	<input type="text" name="lastName" id="lastName" />
        	</p>
        
        	<input type="submit" />
    	</form>
    	<h3>In Database:</h3>
    	<ul>
        	<c:forEach var="person" items="${ persons }">
            	<li><c:out value="${ person.lastName }" /> <c:out value="${ person.firstName }" /></li>
        	</c:forEach>
    	</ul> 
    </body>
</html>