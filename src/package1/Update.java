package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
	int update(String url,String pwd,String uname,String pass,String role)
	{
		 try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection(url,"root",pwd);
	            Statement stmt = con.createStatement();
	            stmt.executeUpdate("insert into users values('"+uname+"','"+pass+"','"+role+"');");
	            return 1;
	            }
		 catch(Exception e){
	            	System.out.println(e);
	            	return 0;}
	}
}
