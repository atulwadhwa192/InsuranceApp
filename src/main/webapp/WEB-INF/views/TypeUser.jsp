<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>



<!DOCTYPE html>
<html>
<head>
<%-- <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet"> --%>
<spring:url value="/resources/UserType.css" var="UserType" />

<meta charset="UTF-8">
<title>Insurance App</title>
<style type="text/css">

.container { 
	display : flex;
	flex-direction: row;
	justify-content: space-around;
	display: flex;
	width: 20%;
}

.UserForm {

	display: block;
	padding: 10px;
	display: inline;
	margin-right: 20px;
	margin-bottom: 50px;
	text-align: justify;
	display: block;
}

.AdminForm {

	display: block;
	padding: 10px;
	text-align: justify;
	/*     margin-top: 100px; OR ADD THIS LINE AND SET YOUR PROPER SPACE as the space above box2 */
}
</style>
</head>
<body>
	<h1>Welcome to the Insurance App</h1>
	<br>
	<br>
	<br>
	<h3>Please select one from below</h3>
	<div class="container">
		<div class="UserForm">
			<form action="UserLogin" method="get">
				<button class="User">User</button>
			</form>
		</div>

		<div class="AdminForm">
			<form action="AdminLogin" method="get">
				<button class="Admin">Admin</button>
			</form>
		</div>


	</div>



</body>
</html>