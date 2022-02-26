<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    
    <h3>
    Hello 
    		<c:out value="${ form.getStatus() }"></c:out>
    </h3>
    
    <body>
    	<form method="post" action="hello">
    		<p>
    			<label for="username">Username :</label>
    			<input type="text" name="username" id="username"/>
    		</p>
    		<p>
    			<label for="passWord">Password :</label>
    			<input type="password" name="passWord" id="passWord"/>
    		</p>
    		<input type="submit" />
    	</form>
    </body>
</html>