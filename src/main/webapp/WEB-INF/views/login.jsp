<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
    <h1 align="center"> Fill the Insurance Forum</h1>
    
    
    
       <form action="submitForm" method="post">
       	<div class="Fname">
       		<label for="fname"> Enter Your First Name</label>
       		<input type="text" name="fname" id="fname" required>
       	</div>
       	<br>
		
		<div class="Lname">
       		<label for="lname"> Enter Your First Name</label>
       		<input type="text" name="lname" id="lname" required>
       	</div>  
       	<br>     
       	
       	<div class ="dob">
       		<label for ="userdob">Choose your Date Of Birth</label>
       		<input type="date" id="userdob" name="userdob">
       		
       	</div>
       	<br>
       		
       	<div class="Email_id">
       	 <label for="email"> Enter your email</label>
       	 <input type="email" name="email" id="email " required>
       	 
       	  </div>
       	  <br>
       	  
       	  <div class="MobNumber">
       	 <label for="num"> Enter your Mobile Number</label>
       	 <input type="text" name="num" id="num " required>
       	 
       	  </div>
       	  <br>
       	  <div class="Gender">
       	  	<label for="gender"> Gender</label>
       	  	<select id="gender" name="gender">
       	  		<option value="Male">Male</option>
       	  		<option value="Female">Female</option>
       	  	</select>
       	  </div>
       	  <br>
       	   </div>
       	  <div class="Userincome">
       	 <label for="income"> Enter Your Income </label>
       	 <input type="number" name="income" id="income" required>

       	  </div>
       	  <br>
       	  <div class="Tobacoo">
       	  	<label for="tobacco"> Tobacco</label>
       	  	<select id="tobacco" name="tobacco">
       	  		<option value="Yes">Yes</option>
       	  		<option value="No">No</option>
       	  	</select>
       	  </div>
       	  <br>
       	  <div class="LifeCover">
       	 <label for="lifecover"> Enter Life Cover Amount </label>
       	 <input type="number" name="lifecover" id="lifecover" min="0" max="30000000" required>

       	  </div>
       	  <br>
       	  <div class="LifeCoverAge">
       	 <label for="lifecoverage"> Enter Life Cover Age </label>
       	 <input type="number" name="lifecoverage" id="lifecoverage" min="0" max="100" required>

       	 
       	  
       	  
       	 <div class="Submitform">
    		<input type="submit" value="Submit">
 		 </div>
       	  
       		
       
       </form>
    </body>
</html>
