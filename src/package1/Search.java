package package1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search
 */
@WebServlet(name = "Search", urlPatterns = { "/Search" })
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String image = request.getParameter("image");
		String city=request.getParameter("city");
		String address=request.getParameter("address");
		String type=request.getParameter("type");
		String rooms=request.getParameter("rooms");
		String Price=request.getParameter("price");
		House h=new House();
		int i=h.insertData(image,city, address, type, rooms, Price);
		if(i==1){
			response.sendRedirect("seller.jsp");
		}
   
	}

	
}