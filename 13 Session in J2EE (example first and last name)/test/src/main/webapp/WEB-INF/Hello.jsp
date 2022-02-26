<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
    	<c:if test="${ !empty sessionScope.lastName && !empty sessionScope.firstName }">
        	<p>Hello ${ sessionScope.lastName } ${ sessionScope.firstName } !</p>
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
    </body>
</html>