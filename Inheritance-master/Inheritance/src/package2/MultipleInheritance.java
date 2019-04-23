//Multilevel Inheritance in java
package package2;
class Calculator
{
	 public int sum(int i,int j)
	 {
		 return i+j;
	 }
}
class AdvanceCalculator extends Calculator
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}
class MostAdvancedCalculator extends AdvanceCalculator
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		MostAdvancedCalculator obj=new MostAdvancedCalculator();
		int add=obj.sum(20,10);
		int diff=obj.sub(20,10);
		int pro=obj.mul(20,10);
		System.out.println("The sum is :"+add);
		System.out.println("The difference is :"+diff);
		System.out.println("The product is :"+pro);
	}

} 
