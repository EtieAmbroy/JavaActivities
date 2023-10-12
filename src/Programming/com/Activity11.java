package Programming.com;

import java.util.Scanner;

public class Activity11 {
    public static void Fibonacci() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Fibonnaci numbers to generate : ");
        int N = scan.nextInt();

        int firstTerm = 1;
        int secondTerm = 1;

        System.out.println("Fibonacci Sequence for N = " + N);
        System.out.print(firstTerm + " " + secondTerm + " ");

        for(int i = 3; i <= N; i++) {
           int  nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}
