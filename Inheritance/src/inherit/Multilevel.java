package inherit;
class Calc
{
	int sum(int a,int b)
	{
		return a+b;
	}
}
class Advanced extends Calc
{
	int sub(int a,int b)
	{
		return a-b;
	}
}
class MAdvanced extends Advanced
{
	int mul(int a,int b)
	{
		return a*b;
	}
}
public class Multilevel {
	public static void main(String[] args) {
		MAdvanced obj=new MAdvanced();
		int ans=obj.sum(30,20);
		int ans2=obj.sub(30, 20);
		int ans3=obj.mul(30,20);
		System.out.println("Sum of the numbers is :"+ans);
		System.out.println("Difference of the numbers is:"+ans2);
		System.out.println("Multiplication of the numbers is :"+ans3);
	}

}
