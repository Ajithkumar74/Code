package MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertDemo {

	public static void main(String[] args) throws SQLException{
		Connection myconn=null;
		Statement mystmt=null;
		ResultSet myRs=null;
		
		String dbUrl="jdbc:mysql://localhost:3306/demo";
		String user="student";
		String pass="student";
		
		try {
			// 1. Get a connection to database
			myconn=DriverManager.getConnection(dbUrl,user,pass);
			
			//			// 2. Create a statement
				mystmt=myconn.createStatement();
				// 3. Insert a new employee
				System.out.println("Inserting a new employee to database\n");
				int rowAffected=mystmt.executeUpdate(
						"insert into employees " +
						"(last_name, first_name, email, department, salary) " + 
						"values " + 
						"('Wright', 'Eric', 'eric.wright@foo.com', 'HR', 33000.00)");
// 4. Verify this by getting a list of employees
				myRs = mystmt.executeQuery("select * from employees order by last_name");
				// 5. Process the result set
				while (myRs.next()) {
					System.out.println(myRs.getString("last_name") + ", " + myRs.getString("first_name"));
				}
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (mystmt != null) {
				mystmt.close();
			}
			
			if (myconn != null) {
				myconn.close();
			}
			}
		}
	}

