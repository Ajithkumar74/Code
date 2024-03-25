package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Exp1 {

	public static void main(String[] args) throws Exception{
		// 1 load the driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//2 create connection object
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/webnr","root","A##67k@jith");
		
		//3 create statement object
		Statement stmt=con.createStatement();
		//4 execute query
		stmt.execute("create table employee "+"(id int, "+"e_name varchar(50), "+"company varchar(20) ");
		
		/*
		 * String sql1="insert into employee values (1,'King', 'BCCI')"; String
		 * sql2="insert into employee values (2,'Rohit', 'ICC')"; String
		 * sql3="insert into employee values (3,'Virat', 'WCP')"; String
		 * sql4="insert into employee values (4,'Nilesh', 'CGI')"; String
		 * sql5="insert into employee values (5,'Samrat', 'PWC')";
		 * 
		 * stmt.executeBatch();
		 */
		//System.out.println("table created");
		//close the connection 
        System.out.println("Created table in given database...");   	  

		con.close();
		
	}

}
