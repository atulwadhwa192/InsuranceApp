<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="ApprovalPageAdmin" method="post">
	<div class="Username">
       	 <label for="email"> Enter your email: </label>
       	 <input type="email" name="email" id="email " required>
	</div>
	<br>
	<div class="Password">
       	 <label for="password"> Enter your Password: </label>
       	 <input type="password" name="password" id="password " required>
	</div>
	
	 <div class="Submitform">
    		<input type="submit" value="Submit">
 		 </div>

</form>

</body>
</html>