import java.util.Scanner;
class Sum {
	int a,b;
	public Sum(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int doSum()
	{
		return a+b;
	}
}
class Sub{
	int a,b;
	public Sub(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int doSub()
	{
		return a-b;
	}
}
class Mul{
	int a,b;
	public Mul(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	int doMul()
	{
		return a*b;
	}
}
public class Calculator {
	public static void main(String []ars)
	{
		while(true){
				{
			System.out.println("\nEnter your choice :\n1.Add\n2.Subtract \n3.Multiply 4.Exit");
		System.out.println("Enter your choice :");
		Scanner obj=new Scanner(System.in);
		int ch=obj.nextInt();
		System.out.println("Enter the number a :");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the number b :");
		int b=sc.nextInt();
		switch(ch)
		{
		case 1:
			Sum s = new Sum(a, b);
			int sum = s.doSum();
			System.out.println("The sum is :\n"+ sum);
			break;
		case 2:;
			Sub s1=new Sub(a,b);
			int sub=s1.doSub();
			System.out.println("The difference is :\n"+sub);
			break;
		case 3:
			Mul m=new Mul(a,b);
			int mul=m.doMul();
			System.out.println("The product is :\n"+mul);
			break;
		//case 4:exit(0);
			default:
				System.out.println("Enter the valid choice ..(1-3).Otherwise fuckoff");
		}
				}	}
	}
}
