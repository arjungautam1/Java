package atmclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class BankStatement {
	public void bankStatement()throws Exception
	{
		Scanner s=new Scanner(System.in);
		String url3="jdbc:mysql://localhost:3306/atm";
		String uname3="root";
		String pass3="";
		System.out.println("Enter the pin number:");
		int pin_no3=s.nextInt();
		String query3="select * from deposit where pin="+pin_no3+"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con3=DriverManager.getConnection(url3,uname3,pass3);
		Statement st3=con3.createStatement();
		ResultSet rs3=st3.executeQuery(query3);
		rs3.next();
		System.out.println("\t !! Bank Statement !!");
		String stat="\nDeposited amount :   "+rs3.getInt("deposit")+"\nWithdrawn Amount:   "+rs3.getInt("withdraw");
		String stat1="\nAvailable Balance: "+(rs3.getInt("deposit")-rs3.getInt("withdraw"));
		System.out.println(stat);
		System.out.println(stat1);
	}

}
