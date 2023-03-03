package jdbcmavendemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  try {
	            Class.forName("org.postgresql.Driver");
	            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "admin");
	            Statement stmt = con.createStatement();
	            ResultSet set = stmt.executeQuery("select * from student");
	            while (set.next()) {
	                System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getInt(3));
	            }
	 
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
}

