package package1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Check {
	static Connection con;
	static Statement stmt;
	HttpServletRequest request;
	HttpServletResponse response;
	int process(String url,String pwd,String username,String password,String role) {
			try {
				Class.forName("com.mysql.jdbc.Driver");

			} catch(java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}

			try {
				con = DriverManager.getConnection(url, "root", pwd);
				stmt = con.createStatement();
	   		    ResultSet rs=stmt.executeQuery("select * from users");
	   		    while(rs.next())  
   		    	{
	   		    	System.out.println(rs.getString(1)+" "+rs.getString(2));
	   		    	if(username.equals(rs.getString(1)) && password.equals(rs.getString(2)) && role.equals(rs.getString(3)))
	   		    	{
	   		    		return 1;
	   		    	}
   		    	}
			} catch(SQLException ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}finally{
				try{
					stmt.close();
					con.close();
				}catch(SQLException e){}
			}
			return 0;
	}       
}
