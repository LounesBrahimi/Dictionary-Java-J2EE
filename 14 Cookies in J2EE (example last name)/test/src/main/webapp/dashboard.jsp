<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>
</head>
<body>
	<h2> Welcome to the Dashboard </h2>
    <c:if test="${ !empty sessionScope.lastName && !empty sessionScope.firstName }">
        <p>You are ${ sessionScope.lastName } ${ sessionScope.firstName } !</p>
    </c:if>
</body>
</html>