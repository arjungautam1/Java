package compete;
import java.util.Scanner;

public class Day1{
	
    private static Scanner scan;

	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        scan = new Scanner(System.in);


        /* Declare second integer, double, and String variables. */
    int inew;
    double dnew;
    String strNew;
        /* Read and save an integer, double, and String to your variables.*/
        inew=scan.nextInt();
        dnew=scan.nextDouble();
        scan.nextLine();
        strNew=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+inew);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d+dnew);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s+strNew);
        //scan.close();
    }
}

