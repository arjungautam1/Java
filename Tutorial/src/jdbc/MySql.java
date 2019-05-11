package jdbc;
import java.sql.*;

public class MySql {
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/demo";
		String uname="root";
		String pass="";
		String query="select address from mysql where roll=1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String address=rs.getString("address");
		System.out.println(address);
		st.close();
		con.close();
		
	}

}
