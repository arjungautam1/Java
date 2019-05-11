package compete;

import java.util.*;

public class Day3{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2==1)
        {
            System.out.println("Weird");
        }
        else
        {
            if(N>5 && N<21)
            {
                System.out.println("Weird");
            }
            else if((N>1 && N<6) || (N>20))
            {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}
