package package1;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SignUp1")

public class SignUp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SignUp1()
	{
		System.out.println("yaha to aaya");
	}

    void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try  {
           
        	String url = "jdbc:mysql://localhost/MovieRating";
        	String pwd = "abc123";
    		String uname = request.getParameter("user_name");
    		String pass = request.getParameter("pass");
    		String role = request.getParameter("role");
    		int i=0;

    		Update u=new Update();
    		i=u.update(url,pwd,uname,pass,role);
            if(i==1)
		  		response.sendRedirect("logIn.jsp");

        }catch(Exception e){  }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}