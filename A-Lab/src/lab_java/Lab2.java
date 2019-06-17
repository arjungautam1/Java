package lab_java;
import java.util.Scanner;

//program to input all the datatype and display all 
public class Lab2 {
public static void main(String[] args) {
	Boolean bool;
	byte b;
	short s;
	int i;
	long l;
	double d;
	float f;
	char c;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Boolean");
	bool=sc.nextBoolean();
	System.out.println("Enter byte:");
	b=sc.nextByte();
   System.out.println("Enter Short ");
   s=sc.nextShort();
   System.out.println("Enter any integer:");
   i=sc.nextInt();
   System.out.println("Enter Long Data type");
   l=sc.nextLong();
   System.out.println("Enter float Datatype");
   f=sc.nextFloat();
   System.out.println("Enter double Datatype:");
   d=sc.nextDouble();
   System.out.println(bool);
   System.out.println(b);
   System.out.println(s);
   System.out.println(l);
   System.out.println(i);
   System.out.println(f);
   System.out.println(d);
   
	
	
}
}
