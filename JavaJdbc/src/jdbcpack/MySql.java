package jdbcpack;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySql {
	public static void main(String[] args) {
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/csitfourth","root","");
			System.out.println("Database Connection Success:");	
		}
		catch(Exception e)
		{
			System.out.println("Database conn failed");
			e.printStackTrace();
		}
	
	}

}
