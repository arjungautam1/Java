package inherit;

//program to inherit Sum using Difference derived class
class Calculator
{
	public int Sum(int a,int b)
	{
		return a+b;
	
	}
}
class AdvancedCalculator extends Calculator
{
	public int Sub(int a,int b)
	{
		 return a-b;
	}
}
public class Single {
	public static void main(String []args)
{
	 AdvancedCalculator obj=new AdvancedCalculator();
	 int ans=obj.Sum(20,10);
	 int ans2=obj.Sub(20,10);
	 System.out.println("Sum is:"+ans);
	 System.out.println("Difference is:"+ans2);
	 
}
}