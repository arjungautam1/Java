package atmclass;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws Exception {
		while(true)
		{
			System.out.println("\n\t 		!!!     TEXAS INT'L BANK      !!!"); 
			System.out.println("\n Enter your choice :\n1.Go to Bank  (Account/Deposit)\n 2.Go to ATM  \n 3.Exit ");
			System.out.println("Enter your choice here (1-3)");
			Scanner s=new Scanner(System.in);
			int choice=s.nextInt();
		
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter your choice:\n1.Create Account \n2.Deposit amount \n3.Exit");
				int choice1=s.nextInt();
				switch(choice1)
				{
				case 1:
					CreateAccount obj=new CreateAccount();
					obj.method();
					break;
				case 2:
					Deposit obj1=new Deposit();
					obj1.depositAccount();
					break;
				case 3:
					System.out.println("!!   Dhanyabaad  !!");
					System.exit(0); 
					break;
				}
			}
				break;
			case 2:
				System.out.println("\nEnter your choice :\n1.General  Information \n2. Balance Enquiry: \n 3.Withdraw \n 4. Bank Statement \n5.Change pin number .\n 6.Exit");
				int ch2=s.nextInt();
				switch(ch2)
				{
				case 1:
					AccountInformation obj2=new AccountInformation();
					obj2.generalInformation();
					break;
				case 2:
					BalanceEnquiry obj3=new BalanceEnquiry();
					obj3.balance();
					break;
				case 3:
					WithDraw obj4=new WithDraw();
					obj4.withDraw();
					break;
				case 4:
					BankStatement obj5=new BankStatement();
					obj5.bankStatement();
					break;
				case 5:
					PinNumber obj6=new PinNumber();
					obj6.changePin();
					break;
				case 6:
					System.exit(0);
					break;
				}
				break;
				
			case 3:
				System.exit(0);
				break;
			}
	
		}
	}
}

