package OracleConn;

import java.sql.*;

public class JDBCMetaInfo {

	public static void main(String[] args) {
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			 
			//step2 create  the connection object 
			 
			  Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521/orcl","SYSTEM","BIKE");
			  
			  PreparedStatement ps=con.prepareStatement("Select * from emp");
			  ResultSet rs=ps.executeQuery();
			  ResultSetMetaData rsmd=rs.getMetaData();
			  
				System.out.println("Total columns: "+rsmd.getColumnCount());  
				System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
				System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
				System.out.println(rsmd.getColumnDisplaySize(1));
				con.close();  

		}catch(Exception e){
			System.out.println(e);
		}
	}

}
