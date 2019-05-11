package practice;

//program to insert into the mysql database from the java jdbc
import java.sql.*;
public class MySqlJdbc{
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/demo";
		String uname="root";
		String pass="";
		String query="insert into mysql (roll ,name,address)values(4,'Krishna','Brindaban')";
	//	String query ="delete from mysql where roll=4";
				Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		st.executeUpdate(query);
	}
}