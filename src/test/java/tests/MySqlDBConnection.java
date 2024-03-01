package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlDBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amandb1","root","admin");
		if(connection.isClosed()) {
			System.out.println("Not Connected with Database");
		}
		else {
			System.out.println("Connection is successful");
		}
        Statement stmt=connection.createStatement(); 
        ResultSet rs=stmt.executeQuery("select* from amandb1.emptable");
        
        while(rs.next()) {
        	System.out.println(rs.getString("uname")+" "+rs.getInt("pwd"));
//        	System.out.println(rs.getInt("EmpId"));
        }
		
		
	}

}
