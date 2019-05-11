package practice;
//pogram to input the string in database using the jdbc java
import java.util.Scanner;
import java.sql.*;

public class MysqlJdbc2 {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/csit";
		String uname="root";
		String pass="";
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Roll No.");
		int rollNo=obj.nextInt();
		System.out.println("Enter the name");
		String name=obj.next();
		System.out.println("Enter the caste");
		String caste=obj.next();
	//	String query ="alter table data auto_increment=100";
	String query="insert into data (roll,name,caste)values("+rollNo+",'"+name+"','"+caste+"')";
	//	String query="delete from data where roll=5";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		st.executeUpdate(query);
		
	}

}
