package OracleConn;

import java.sql.*;
public class SelectDemo {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		ResultSet st=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "SYSTEM","BIKE");
			
			stmt=con.createStatement();
			st=stmt.executeQuery("Select * from students");
			
			while(st.next()) {
				System.out.println(st.getInt("id")+" "+st.getString("name")+" "+st.getInt("age"));
			}
			con.close();
		}catch(Exception e) {
			System.out.println("Problem");
			e.printStackTrace();
		}
	}

}
