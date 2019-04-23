package package2;
class Calc	//parent class
{
	public int sum(int i,int j)
	{
		return i+j;
	}
}
class AdvancedCalc extends Calc{	//sub class 
	public int sub(int i,int j)
	{
		return i-j;
	}
}


public class InheritanceDemo {
	public static void main(String []args) {
	
	AdvancedCalc obj=new AdvancedCalc();
	int ans=obj.sum(30,20);
	int ans2=obj.sub(30, 20);
	System.out.println("The sum of the provided numbers is :"+ans);
	System.out.println("The difference is :"+ans2);
}
}
