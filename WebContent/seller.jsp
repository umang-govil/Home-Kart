<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Seller Page</title>
<link href="seller.css" rel="stylesheet">
<link href="grayscale.min.css" rel="stylesheet">
<link href="bootstrap.min.css" rel="stylesheet">
<link href="bootstrap1.min.css" rel="stylesheet">
</head>
<body>
<%
	if(session.getAttribute("USERNAME")==null)
	{
		response.sendRedirect("logIn.jsp");
	}
%>
<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                    Menu <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" >
                     <span class="light"></span> Home_Rental
                </a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                <ul class="nav navbar-nav">
                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="Menu.jsp">Search</a>
                    </li>
                    <li>
                    	
                        <a class="page-scroll" href="Signout">Sign Out</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
<form method="get" action="Search">
			  <div class="main-container">
			
			    <!-- Sign Up Container Section !-->
			    <div class="email-login-container">
			      <h3>Submit Details</h3>
			      <b><label class="label2">Image :</label></b>
			      	 <input type="text" placeholder="Image" name="image" class="input-box" />
			      <b><label class="label2">City : </label></b>
			        <input type="text" placeholder="City" name="city" class="input-box" />
			      <b><label class="label2">Address : </label></b> 
			        <input type="address"  placeholder="Address" name="address" class="input-box" />
			       <b><label class="label2"> Property Type :<select class="input-box" name="type"> 
			       	<option class="input-box" value="Flat">Flat</option>
			        <option class="input-box" value="Bungalow">Bungalow</option>
			        </select>
			        </label></b>
			         <b><label class="label2">Rooms :<select class ="input-box" name="rooms">
					    <option class = "input-box" value="1 BHK">1 BHK</option>
					    <option class = "input-box" value="2 BHK">2 BHK</option>
					    <option class = "input-box" value="3 BHK">3 BHK</option>
					 </select>
					 </label></b>
				 <b><label class="label2">Rent Price :</label> <input type="text" name="price" class="input-box">
			         
			        <input type="submit" value="Submit" name="login-button" class="login-button" />
			    </div>
			
			    
	</form>

</body>
</html>