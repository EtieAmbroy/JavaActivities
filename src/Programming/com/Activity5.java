package Programming.com;

import java.util.Scanner;

public class Activity5 {
    public static void SodaInLiters() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of bottles : ");
        int bottle = scan.nextInt();

        System.out.print("Enter the number of cans : ");
        int can = scan.nextInt();

        double sodaBottle = bottle * 2;
        double sodaCan = (can*12)*29.586/1000;

        double totalSodaLiters = sodaBottle + sodaCan;

        System.out.println("The total amount of soda in Liters " + totalSodaLiters);
    }
}
