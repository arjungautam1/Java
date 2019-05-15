package atmclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AccountInformation {
	public void generalInformation() throws Exception
	{
		Scanner s = new Scanner(System.in);
		String url="jdbc:mysql://localhost:3306/atm";
		String uname="root";
		String pass="";
		System.out.println("Enter the account number:");
		int account_no=s.nextInt();
		String query="select * from account where account_no="+account_no+"";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st =con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		System.out.println("\t  !!   Account Information  !!\nAccount Number: ");
		int accno=rs.getInt("account_no");
		System.out.print(accno);
		String accinfo="\nFirst Name :  "+rs.getString("first_name")+"  "+rs.getString("last_name")+"\nAddress:   "+rs.getString("address");
		System.out.print(accinfo);
		String otherinfo="\nMarital Status:  "+rs.getString("marital_status")+"\nProfession:  "+rs.getString("profession")+"\nCitizenship:  "+rs.getString("citizenship")+"\nContact No:  "+rs.getInt("contact_no")+"\n";
		System.out.print(otherinfo);
	}

}
