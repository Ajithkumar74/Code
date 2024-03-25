package OracleConn;

import java.sql.*;
import java.util.*;

public class DeleteDemo {

	public static void main(String[] args) {
		Connection con=null;
        PreparedStatement ps=null;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
		try {
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			 
			//step2 create  the connection object 
			 
			   con=DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521/orcl","SYSTEM","BIKE");
			   
			   String str="Delete from student where id=?";
			   ps=con.prepareStatement(str);
			   ps.setInt(1, id);
			   int ans=ps.executeUpdate();
			   if (ans>0)
		            System.out.println("Record Deleted");
		}catch(Exception e) {
			System.out.println("Problem");
            e.printStackTrace();
		}
	}

}
