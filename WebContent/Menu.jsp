<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Seller Page</title>
<link href="menu.css" rel="stylesheet">
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
                        <a class="page-scroll" href="#about">About</a>
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
<form method="get" action="servletboxservlet">
			  <div class="main-container">
			
			    <!-- Sign Up Container Section !-->
			    <div class="email-login-container">
			      <h3>Search Filters</h3>
			      <b><label class="label3">City : </label></b>
			        <input type="text" placeholder="City" name="searchcity" class="input-box" />
			      
			       <b><label class="label3">Rooms : <select class="input-box" name="bedrooms"> 
			       	<option class="input-box" value="1 BHK">1 BHK</option>
			        <option class="input-box" value="2 BHK">2 BHK</option>
			        <option class="input-box" value="3 BHK">3 BHK</option>
			        <option class="input-box" value="xyz">No Preference</option>
			        </select>
			        </label></b>
			         <b><label class="label3">Maximum Price :<select class ="input-box" name="max">
					    <option class = "input-box" value="50000">50K</option>
					    <option class = "input-box" value="100000">1 Lakh</option>
					    <option class = "input-box" value="150000">1.5 Lakh</option>
					    <option class = "input-box" value="200000">2 Lakh</option>
					    <option class = "input-box" value="250000">2.5 Lakh</option>
					    <option class="input-box" value="0">No Limit</option>
					 </select>
					 </label></b>
				
			         
			        <input type="submit" value="Submit" name="login-button" class="login-button" />
			    </div>
			
			    
	</form>

</body>
</html>