<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LogIn</title>
<link href="log_in.css" rel="stylesheet">
</head>
<body>
	<form method="get" action="logIn">
			  <div class="main-container">
			
			    <!-- Login Container Section !-->
			    <div class="email-login-container">
			      <h3>Login</h3>
			        <input type="text" placeholder="Username" name="user_name" class="input-box" />
			        <input type="password"  placeholder="Password" name="pass" class="input-box" />
			        <select class ="input-box" name="role">
					    <option class = "input-box" value="buyer">Buyer</option>
					    <option class = "input-box" value="seller">Seller</option>
					 </select>
			        <input type="submit" value="Log in" name="login-button" class="login-button" />
			    </div>
			
			    <div class="or-container">
			      <span class="or-text">Or</span>
			    </div>
			
			    <!--Sign up Container Section !-->
			    <div class="sign-up-container">
			      <a href="SignUp.jsp" > <h4>Don't have an account?Create now</h4></a>
			    </div>
			
			  </div>
	</form>

</body>

</html>