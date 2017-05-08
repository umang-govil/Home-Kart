<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign-Up</title>
<link href="signUp.css" rel="stylesheet">
</head>
<body>
	<form method="get" action="SignUp1">
			  <div class="main-container">
			
			    <!-- Sign Up Container Section !-->
			    <div class="email-login-container">
			      <h3>Sign Up</h3>
			      <b><label class="label">Username : </label></b>
			        <input type="text" placeholder="Username" name="user_name" class="input-box" />
			      <b><label class="label">Password : </label></b> 
			        <input type="password"  placeholder="Password" name="pass" class="input-box" />
			      <b><label class="label">Role : </label></b>	
			         <select class ="input-box" name="role">
					    <option class = "input-box" value="buyer">Buyer</option>
					    <option class = "input-box" value="seller">Seller</option>
					 </select>
			         
			        <input type="submit" value="Sign Up" name="login-button" class="login-button" />
			    </div>
			
			    <div class="or-container">
			      <span class="or-text">Or</span>
			    </div>
			
			    <!--Sign up Container Section !-->
			    <div class="sign-up-container">
			      <a href="logIn.jsp" > <h4>Already have a account! Log in</h4></a>
			    </div>
			
			  </div>
	</form>

</body>
</html>