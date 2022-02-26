<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Hello Page</title>
    </head>
    <body>
        <h2> 
        	<c:out value="Hello ${ person.getFirstName()} ${ person.getLastName()}"/>
        </h2>
      	<c:choose>
  			<c:when test="${person.getAge() >= 18}">
    			Your are an adult
  			</c:when>
  			<c:when test="${person.getAge() < 18}">
    			Your are not an adult
  			</c:when>
  			<c:otherwise>
    			Error
  			</c:otherwise>
		</c:choose>
        <h2> 
        	<c:out value="Hello ${ person2.getFirstName()} ${ person2.getLastName()}"/>
        </h2>
      	<c:choose>
  			<c:when test="${person2.getAge() >= 18}">
    			Your are an adult
  			</c:when>
  			<c:when test="${person2.getAge() < 18}">
    			Your are not an adult
  			</c:when>
  			<c:otherwise>
    			Error
  			</c:otherwise>
		</c:choose>
    </body>
</html>