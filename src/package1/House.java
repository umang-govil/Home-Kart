package package1;

import java.sql.*;


public class House {
	String image;
	String city;
	String address;
	String type;
	String rooms;
	String price;
            
		public int insertData(String image,String city,String address,String type,String rooms,String price){
                
				String url = "jdbc:mysql://localhost/MovieRating";
				String user="root";
				String pass="abc123";
				try{
				Class.forName("com.mysql.jdbc.Driver");}
				catch(java.lang.ClassNotFoundException e){
					System.err.print("ClassNotFoundException: ");
					System.err.println(e.getMessage());
				}

		
		try{
			
		   Connection con = DriverManager.getConnection(url,user,pass); 
		    Statement stmt=con.createStatement();
   		    ResultSet rs=stmt.executeQuery("select * from House1");
   		    int houseid=0;
   		    while(rs.next())
   		    {
   		    	houseid=rs.getInt(1);
   		    }
   		    houseid++;
		    System.out.println("con created");
stmt.executeUpdate("insert into House1(houseid,image,city,address,type,rooms,price) values('"+houseid+"','"+image+"','"+city+"','"+address+"','"+type+"','"+rooms+"','"+price+"');");    
		    
		    System.out.println("hello");
		    return 1;
		}
		    catch(SQLException ex) {
				ex.printStackTrace();
				
			}
		
	   return 0;
}

	  
  }
	