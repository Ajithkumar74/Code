package OracleConn;

import java.sql.*;

public class OracleConnection {
	public static void main(String[] args) throws Exception{
  try {
	//step1 load the driver class  
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  
	//step2 create  the connection object 
	  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SYSTEM", "BIKE");
	  
	//step3 create the statement object  
	  Statement stmt=con.createStatement();
	  
	//step4 execute query  
	  ResultSet rs=stmt.executeQuery("select * from emp");
	  
	//step5 close the connection object

	  while(rs.next()) {
		  System.out.println(rs.getInt("empid")+"  "+rs.getString("empname"));  

	  }
	  con.close();
  }catch(Exception e) {
	  e.printStackTrace();
  }
	
	}
}