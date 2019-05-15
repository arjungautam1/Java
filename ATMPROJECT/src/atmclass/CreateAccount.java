package atmclass;
import java.sql.*;
import java.util.Scanner;
public class CreateAccount {
	public void method() throws Exception
	{
	String url="jdbc:mysql://localhost:3306/atm";
	String uname="root";
	String pass="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Account No:");
	int acc=sc.nextInt();
	System.out.println("Enter the first Name:");
	String fn=sc.next();
	System.out.println("Enter the last name:");
	String ln=sc.next();
	System.out.println("Enter the address:");
	String add=sc.next();
	System.out.println("Enter the marital status:");
	String mari=sc.next();
	System.out.println("Enter the profession:");
	String prof=sc.next();
	System.out.println("Enter citizenship");
	String citizen=sc.next();
	System.out.println("Enter contact No:");
	int contact=sc.nextInt();
	
	
	String query="insert into account(account_no,first_name,last_name,address,marital_status,profession,citizenship,contact_no)values("+acc+",'"+fn+"','"+ln+"','"+add+"','"+mari+"','"+prof+"','"+citizen+"',"+contact+")";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	Statement st=con.createStatement();
	st.executeUpdate(query);
	st.close();
	con.close();
	
	}
}