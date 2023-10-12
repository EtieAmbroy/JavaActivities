package Programming.com;

import java.util.Scanner;

public class Activity6 {
    public static void totalSeconds() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of Seconds : ");
        int totalSeconds = scan.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600)/60;
        int seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " Second is " + hours + " Hour/s " + minutes + " Minute/s and " + seconds + " Seconds");
    }
}
