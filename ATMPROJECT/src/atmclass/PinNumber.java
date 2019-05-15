package atmclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class PinNumber {
	public void changePin() throws Exception
	{
		Scanner s=new Scanner(System.in);
		String url4="jdbc:mysql://localhost:3306/atm";
		String uname4="root";
		String pass4="";
		System.out.println("Enter your old pin number: ");
		int pin_no4=s.nextInt();
		System.out.println("Enter the new pin number:");
		int pin_no5=s.nextInt();
		String query5="update deposit set pin="+pin_no5+" where pin="+pin_no4+"";  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con5=DriverManager.getConnection(url4,uname4,pass4);
		Statement st5=con5.createStatement();
		st5.executeUpdate(query5);
	}

}
