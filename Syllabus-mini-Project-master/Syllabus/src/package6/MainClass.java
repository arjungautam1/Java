
package package6;
import java.util.Scanner;

public class MainClass {
	public static void main(String []args)
	{
			System.out.println("Enter the college name :");
			Scanner obj=new Scanner(System.in);
			String name=obj.Line();
			System.out.println("When was your college esblished (2072-2075):");
			Scanner obj1=new Scanner(System.in);
			int estd=obj1.nextInt();
			System.out.println("Books required for "+name+" are listed below buy in time.");
			switch(estd)
			{
			case 2071:
				CsitSyllabus obj2=new SubjectFormat();
				obj2.firstSem();
				obj2.thirdSem();
				obj2.fifthSem();
				obj2.seventhSem();
				break;
				
			case 2072:
				
				CsitSyllabus obj3=new SubjectFormat();
				obj3.secondSem();
				obj3.fourthSem();
				obj3.sixthSem();
				obj3.eighthSem();
				break;
			case 2073:
				CsitSyllabus obj4=new SubjectFormat();
				obj4.firstSem();
				obj4.thirdSem();
				obj4.fifthSem();
				break;
			case 2074:
				CsitSyllabus obj5=new SubjectFormat();
				obj5.firstSem();
				obj5.thirdSem();
				break;
			case 2075:
				CsitSyllabus obj6=new SubjectFormat();
				obj6.firstSem();
				break;
				default:
					System.out.println("\nOh! Sorry.\nInvalid input try(2071-2075)");
					break;
			}
	}
}
