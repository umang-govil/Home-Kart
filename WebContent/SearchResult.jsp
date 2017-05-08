<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<link href="buyer.css" rel="stylesheet">
<link href="grayscale.min.css" rel="stylesheet">
<link href="bootstrap.min.css" rel="stylesheet">
<link href="bootstrap1.min.css" rel="stylesheet">
<body>
	<%
		if (session.getAttribute("USERNAME") == null) {
			response.sendRedirect("logIn.jsp");
		}
	%>
	<%
		String id = request.getParameter("userId");
		String driverName = "com.mysql.jdbc.Driver";
		String connectionUrl = "jdbc:mysql://localhost/";
		String dbName = "MovieRating";
		String userId = "root";
		String password = "abc123";

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
	%>

	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-main-collapse">
					Menu <i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand page-scroll"> <span class="light"></span>
					Home_Rental
				</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div
				class="collapse navbar-collapse navbar-right navbar-main-collapse">
				<ul class="nav navbar-nav">
					<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
					<li class="hidden"><a href="#page-top"></a></li>
					<li><a class="page-scroll" href="Menu.jsp">Search</a></li>
					<li><a class="page-scroll" href="Signout">Sign Out</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container -->
	</nav>

	<%
		try {
			connection = DriverManager.getConnection(connectionUrl + dbName, userId, password);
			statement = connection.createStatement();
			String sql = "SELECT * FROM House2";

			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
	%>



	<div class="main-container">


		<div class="email-login-container">
			<h3>House Details</h3>
		</div>
		<div class="row">
			<div class="col-sm-3">
				<img class="image1" src="images/<%=resultSet.getString(2)%>"
					height="200px" width="200px" />
			</div>
			<div class="col-sm-9">
				<label class="label1">House ID : <%=resultSet.getInt(1)%></label> <label
					class="label1">Type : <%=resultSet.getString(5)%></label><br>
				<label class="label1">Rooms: <%=resultSet.getString(6)%></label><br>
				<label class="label1">Price : <%=resultSet.getInt(7)%>
				</label><br> <label class="label1">Location : <%=resultSet.getString(3)%></label><br>
				<label class="label1">Address : <%=resultSet.getString(4)%></label><br>
			</div>

		</div>


	</div>

	<%
		}
			System.out.println("snkjnf");
			statement.executeUpdate("delete from House2");
			System.out.println("dabfh");
		} catch (Exception e) {
			e.printStackTrace();
		}
	%>

</body>
