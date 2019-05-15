package atmclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Deposit {
	void depositAccount()  throws Exception
	{
		String url1="jdbc:mysql://localhost:3306/atm";
		String uname1="root";
		String pass1="";
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter your account number:");
		int accno=sc1.nextInt();
		System.out.println("Enter the amount to deposit in bank  : ");
		int dep=sc1.nextInt();
		System.out.println("Create new pin number");
		int pin=sc1.nextInt();
			String query1="insert into deposit (account_no,deposit,pin) values ("+accno+","+dep+","+pin+")";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1=DriverManager.getConnection(url1,uname1,pass1);
		Statement st1=con1.createStatement();
		st1.executeUpdate(query1);
	}

}
