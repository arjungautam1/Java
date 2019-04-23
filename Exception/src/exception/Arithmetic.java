package exception;

public class Arithmetic {
	public static void main(String[] args) {
		int i = 8,j= 2,k=0;
		try
		{
			i=j/k;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divided by zero .");
		}
		finally
		{
			System.out.println("This is diplayed whether there is exception or not .");
		}
		
	
		System.out.println(i);
	}
}
