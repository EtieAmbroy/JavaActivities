package Programming.com;

import java.util.Scanner;

public class Activity8 {
    public static void year() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = scan.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Is a Leap Year ");
        } else {
            System.out.println(year + " Is not a Leap Year ");
        }
    }
}
