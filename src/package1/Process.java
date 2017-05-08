package package1;
import java.sql.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Process{
	
	static Connection con;
	static Statement stmt1;
	static Statement stmt2;
	HttpServletRequest request;
	HttpServletResponse response;

      void query1(String search_city,String options_bedrooms,int options_max) {

    	  String url = "jdbc:mysql://localhost/MovieRating";
			String user="root";
			String pass="abc123";

			try {
				Class.forName("com.mysql.jdbc.Driver");
				

			} catch(java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}

			try {
				con = DriverManager.getConnection(url,user,pass);
				stmt1 = con.createStatement();
				stmt2 = con.createStatement();
				
	   		    System.out.println("con created");
	   		   
	   	if(search_city!=null && search_city!="" && !(options_bedrooms.equals("xyz")) && options_max!=0)
	    {
	   		    ResultSet rs1=stmt1.executeQuery("select * from House1 where rooms= '"+options_bedrooms+"' and Price <"+options_max+" and city="+"'"+search_city+"'");
	   		    System.out.println("query1 executed");
	   		    while(rs1.next())
	   		    {
	   		    	stmt2.executeUpdate("insert into House2 values('"+rs1.getInt(1)+"','"+rs1.getString(2)+"','"+rs1.getString(3)+"','"+rs1.getString(4)+"','"+rs1.getString(5)+"','"+rs1.getString(6)+"','"+rs1.getInt(7)+"');");
	   		    }

	   	          
	      }
	   	else if(search_city!=null && search_city!="" && !(options_bedrooms.equals("xyz")) && options_max==0)
	   	{
	   		ResultSet rs2=stmt1.executeQuery("select * from House1 where rooms= '"+options_bedrooms+"' and city= '"+search_city+"'");
   		    System.out.println("query2 executed");
   		    while(rs2.next())
   		    {
   		    	stmt2.executeUpdate("insert into House2 values('"+rs2.getInt(1)+"','"+rs2.getString(2)+"','"+rs2.getString(3)+"','"+rs2.getString(4)+"','"+rs2.getString(5)+"','"+rs2.getString(6)+"','"+rs2.getInt(7)+"');");
   		    }

   		    
	   	}
	   	else if(search_city!=null && search_city!="" && options_bedrooms.equals("xyz") && options_max!=0)
	   	{
	   		ResultSet rs3=stmt1.executeQuery("select * from House1 where city= '"+search_city+"' and Price <"+options_max);
   		    System.out.println("query3 executed");
   		    while(rs3.next())
   		    {
   		    	stmt2.executeUpdate("insert into House2 values('"+rs3.getInt(1)+"','"+rs3.getString(2)+"','"+rs3.getString(3)+"','"+rs3.getString(4)+"','"+rs3.getString(5)+"','"+rs3.getString(6)+"','"+rs3.getInt(7)+"');");
   		    }

   		    
	   	}
	   	else if(search_city=="" && !(options_bedrooms.equals("xyz")) && options_max!=0)
	   	{
	   		ResultSet rs4=stmt1.executeQuery("select * from House1 where Price <"+options_max+" and rooms= '"+options_bedrooms+"'");
   		    System.out.println("query4 executed");
   		    while(rs4.next())
   		    {
   		    	stmt2.executeUpdate("insert into House2 values('"+rs4.getInt(1)+"','"+rs4.getString(2)+"','"+rs4.getString(3)+"','"+rs4.getString(4)+"','"+rs4.getString(5)+"','"+rs4.getString(6)+"','"+rs4.getInt(7)+"');");
   		    }

   		    
	   	}
	   	else if(search_city!=null && search_city!="" && options_bedrooms.equals("xyz") && options_max==0)
	   	{
	   		ResultSet rs5=stmt1.executeQuery("select * from House1 where city= '"+search_city+"'");
   		    System.out.println("query5 executed");
   		    while(rs5.next())
   		    {
   		    	System.out.println("asfrdf");
   		    	try{
   		    		
   		    	
   		    	stmt2.executeUpdate("insert into House2 values('"+rs5.getInt(1)+"','"+rs5.getString(2)+"','"+rs5.getString(3)+"','"+rs5.getString(4)+"','"+rs5.getString(5)+"','"+rs5.getString(6)+"','"+rs5.getInt(7)+"');");
   		    	}catch(SQLException ex) {
   					System.err.println("SQLException: " + ex.getMessage());}
   		    	System.out.println("fdf");
   		    	
   		    }

   		   
	   	}
	   	else if(search_city=="" && options_bedrooms.equals("xyz") && options_max!=0)
	   	{
	   		ResultSet rs6=stmt1.executeQuery("select * from House1 where Price<"+options_max);
   		    System.out.println("query6 executed");
   		    while(rs6.next())
   		    {
   		    	stmt2.executeUpdate("insert into House2 values('"+rs6.getInt(1)+"','"+rs6.getString(2)+"','"+rs6.getString(3)+"','"+rs6.getString(4)+"','"+rs6.getString(5)+"','"+rs6.getString(6)+"','"+rs6.getInt(7)+"');");
   		    }

   		   
	   	}
	   	else if(search_city=="" && !(options_bedrooms.equals("xyz")) && options_max==0)
	   	{
	   		ResultSet rs7=stmt1.executeQuery("select * from House1 where rooms= '"+options_bedrooms+"'");
   		    System.out.println("query7 executed");
   		    while(rs7.next())
   		    {
   		    	stmt2.executeUpdate("insert into House2 values('"+rs7.getInt(1)+"','"+rs7.getString(2)+"','"+rs7.getString(3)+"','"+rs7.getString(4)+"','"+rs7.getString(5)+"','"+rs7.getString(6)+"','"+rs7.getInt(7)+"');");
   		    }

   		    
	   	}
	   	else{}
	   	
	   	      	
			} catch(SQLException ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}finally{
				try{
					stmt1.close();
					stmt2.close();
					con.close();
				}catch(SQLException e){}
			}
			
           }
      
      
     
      
}