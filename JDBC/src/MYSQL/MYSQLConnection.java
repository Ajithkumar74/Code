package MYSQL;

import java.sql.*;
public class MYSQLConnection {

	public static void main(String[] args) {
		try {
			//step:1 load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2 create the connection object
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajithdb","root","A##67k@jith");
			
			//step 3:create statement object
			Statement stmt=con.createStatement();
			
			//step 4:execute query
			ResultSet rs=stmt.executeQuery("select * from Student");
			
			//step5:Read Output from resultset
			System.out.println("Rollno\t student Name \t Marks");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("rollno")+"\t"+rs.getString("studname")+"\t\t"+rs.getDouble("marks"));
			}
			//close connection
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
