package package1;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logIn")
public class logIn extends HttpServlet {
	private static final long serialVersionUID = 1L;  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
				String userName = request.getParameter("user_name");
			  	String password = request.getParameter("pass");
			  	String role = request.getParameter("role");
				String url = "jdbc:mysql://localhost/MovieRating";
				String pwd="abc123";
	
			  	System.out.println(userName + " " + password);
			  	
			  	Check c=new Check();
			  	int i = c.process(url,pwd,userName, password, role);
			  	if(i==1) {
   		    		HttpSession session = request.getSession();
   		    		session.setAttribute("USERNAME",userName);
   		    		HttpSession session2 = request.getSession();
   		    		session2.setAttribute("ROLE",role);
   		    		if(role.equals("buyer"))
			  		response.sendRedirect("buyer.jsp");
   		    		else
   		    			response.sendRedirect("seller.jsp");
			  	}
			  	else{
			  		System.out.println("Invalid Username or Password");
			  		response.sendRedirect("logIn.jsp");
			  	}
	}
	

}
