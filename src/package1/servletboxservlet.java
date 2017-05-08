package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servletboxservlet")
public class servletboxservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	   
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			   String options_bedrooms = request.getParameter("bedrooms");
			  
			  int options_max = Integer.parseInt(request.getParameter("max"));
			  
			   String city = request.getParameter("searchcity");
			  System.out.println(options_max);
			
				   Process p1=new Process();

				   System.out.println("abcd");
				   p1.query1(city,options_bedrooms,options_max);
				   response.sendRedirect("SearchResult.jsp");

			   
			   
			  
		}

	}
