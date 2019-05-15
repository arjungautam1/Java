package atmclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BalanceEnquiry {
	void balance() throws Exception
	{
		Scanner s=new Scanner(System.in);
		String url1="jdbc:mysql://localhost:3306/atm";
		String uname1="root";
		String pass1="";
		System.out.println("Enter the pin number:");
		int pin_no1=s.nextInt();
		String query1="select * from deposit where pin="+pin_no1+"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con1=DriverManager.getConnection(url1,uname1,pass1);
		Statement st1=con1.createStatement();
		ResultSet rs1=st1.executeQuery(query1);
		rs1.next();
		System.out.println("\t  !!  Bank   Balance   Information   !! ");
		
		String depo="\nAvailable  Amount :  "+rs1.getInt("deposit")+"\n";
		System.out.print(depo);
	}

}
