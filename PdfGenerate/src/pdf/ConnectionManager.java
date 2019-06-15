package pdf;
import java.sql.*;
public class ConnectionManager {
public Connection getConnectionn()throws Exception
{
	Connection conn=null;
	System.out.println("Connection called");
	
	String url="jdbc:mysql://localhost:3306/pdf";
	String uname="root";
	String pass="";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	return con;
	
}
}
