package atmclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class WithDraw {
	public void withDraw() throws Exception
	{
		Scanner s=new Scanner(System.in);
		String url2="jdbc:mysql://localhost:3306/atm";
		String uname2="root";
		String pass2="";
		System.out.println("Enter your pin mumber:");
		int pin_no2=s.nextInt();
		System.out.println("Enter the amount to withdraw:");
		int withdraw=s.nextInt();
		String query2="update deposit set withdraw="+withdraw+" where pin="+pin_no2+"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con2=DriverManager.getConnection(url2,uname2,pass2);
		Statement st2=con2.createStatement();
		st2.executeUpdate(query2);
	}

}
