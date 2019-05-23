package updatedatm;

import java.sql.*;
import java.util.Scanner;

public class BankStatement {
	private Scanner s;

	public void bankStatement()throws Exception
	{
		s = new Scanner(System.in);
		System.out.println("Enter your Account number:");
		int acc_no=s.nextInt();
	
	
		String query2="select * from account where account_no="+acc_no+"";
	    Connection con=ConnectionManager.jdbcConnection();
	    Statement st4=con.createStatement();
	    ResultSet rs4=st4.executeQuery(query2);
	    rs4.next();
	    int pin_number=rs4.getInt("pin");	

		System.out.println("Enter your pin number :");
		int pin_no1=s.nextInt();
		
		if(pin_number==pin_no1)
		{
		String query1="select * from debit_bal where account_no="+acc_no+"";
		Connection con1=ConnectionManager.jdbcConnection();
		Statement st1=con1.createStatement();
		ResultSet rs1=st1.executeQuery(query1);
		int total=0;
		System.out.println("\t\t \t!!!          Bank  Statement         !!!\t\t\n");
		System.out.println("\n\t**    Deposit Amounts History :      **\n");
		while(rs1.next())
		{
			 Timestamp t = rs1.getTimestamp("time");
			int debit=rs1.getInt("debit");
			System.out.println("\t"+debit+"  "+t);
			total=rs1.getInt("debit")+total;
		}
		System.out.println("\n\t Total Deposited Balance:    =   "+total);
		
		String query11="select * from credit_bal where account_no="+acc_no+"";
		Connection con11=ConnectionManager.jdbcConnection();
		Statement st11=con11.createStatement();
		ResultSet rs11=st11.executeQuery(query11);
		int total_credit=0;
		System.out.println("\n\t **    Withdrawn Amounts History:       **\n");
		while(rs11.next())
		{
			 Timestamp t1 = rs11.getTimestamp("time");
			int credit=rs11.getInt("credit");
			System.out.println("\t"+credit+"  "+t1);
			total_credit=rs11.getInt("credit")+total_credit;
		}
		System.out.println("\n\t Total Withdrawn Balance=     "+total_credit);
		
		int available_balance=total-total_credit;
		System.out.println("\nAvailable Bank Balance  :    "+available_balance);
		
		String query21="select * from account where account_no="+acc_no+"";
		Connection con2=ConnectionManager.jdbcConnection();
		Statement st2 =con2.createStatement();
		ResultSet rs2=st2.executeQuery(query21);
		rs2.next();
		int pin=rs2.getInt("pin");
		String query="insert into total_bal(account_no,total,pin,debit_total,credit_total) values ("+acc_no+","+available_balance+","+pin+","+total+","+total_credit+")";
		Connection con111=ConnectionManager.jdbcConnection();
		Statement st=con111.createStatement();
		st.executeUpdate(query);
		}
		else
		{
			System.out.println("\t !!	\tAlert\t!!\t**\tIncorect Pin\t** ");
			System.out.println("Enter  Correct pin number Again :");
			int pin_no11=s.nextInt();
			if(pin_number==pin_no11)
			{
				String query1="select * from debit_bal where account_no="+acc_no+"";
				Connection con1=ConnectionManager.jdbcConnection();
				Statement st1=con1.createStatement();
				ResultSet rs1=st1.executeQuery(query1);
				int total=0;
				System.out.println("\t\t \t!!!          Bank Balance         !!!\t\t\n");
				System.out.println("\n\t**    All Deposits:      **");
				while(rs1.next())
				{
					 Timestamp t = rs1.getTimestamp("time");
					int debit=rs1.getInt("debit");
					System.out.println("\n\t"+debit+"  "+t);
					total=rs1.getInt("debit")+total;
				}
				System.out.println("\t Total Deposited Balance:    =   "+total);
				
				String query11="select * from credit_bal where account_no="+acc_no+"";
				Connection con11=ConnectionManager.jdbcConnection();
				Statement st11=con11.createStatement();
				ResultSet rs11=st11.executeQuery(query11);
				int total_credit=0;
				System.out.println("\n\t **    All Credits:       **");
				while(rs11.next())
				{
					 Timestamp t1 = rs11.getTimestamp("time");
					int credit=rs11.getInt("credit");
					System.out.println("\n\t"+credit+"  "+t1);
					total_credit=rs11.getInt("credit")+total_credit;
				}
				System.out.println("\t Total Withdrawn Balance=     "+total_credit);
				
				int available_balance=total-total_credit;
				System.out.println("\nAvailable Bank Balance  :    "+available_balance);
				
				String query21="select * from account where account_no="+acc_no+"";
				Connection con2=ConnectionManager.jdbcConnection();
				Statement st2 =con2.createStatement();
				ResultSet rs2=st2.executeQuery(query21);
				rs2.next();
				int pin=rs2.getInt("pin");
				String query="insert into total_bal(account_no,pin,debit_total,credit_total) values ("+acc_no+","+pin+","+total+","+total_credit+")";
				Connection con111=ConnectionManager.jdbcConnection();
				Statement st=con111.createStatement();
				st.executeUpdate(query);
				String query111="update total set total="+available_balance+"  where account_no="+acc_no+"";
				st.executeUpdate(query111);
					
			}
			else
			{
				System.out.println("\n\t **Alert** !! You have entered incorrect for 2 times .\n\t\t**  Please visit the bank to get new code **");
				
			}
		}
	}

}
