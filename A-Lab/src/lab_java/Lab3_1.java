//explicit datatype conversion 
//narrowing datatype conversion 
// double -->float -->long -->int -->short -->byte 
package lab_java;

public class Lab3_1 {
	public static void main(String[] args) {
		
		double i=100.2;
		
		//narrowing datatype conversion 
		float f=(float)i;
		long l=(long)f;
		int m=(int)l;
		System.out.println("Value of i="+i);
		System.out.println("Value of f="+f);
		System.out.println("Value of l="+l);
		System.out.println("Value of m="+m);
		
		
	}

}
