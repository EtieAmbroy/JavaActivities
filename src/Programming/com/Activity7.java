package Programming.com;

import java.util.Scanner;

public class Activity7 {
    public static void distance() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Distance : ");
        int distance = scan.nextInt();

        int baseDistance = 300;
        int baseFee = 20;
        int addDistance = distance - baseDistance;
        int addFee = 0;

        if(addDistance > 0) {
            addFee = (addDistance/200)*2;
        }
        int totalFee = baseFee + addFee;

        System.out.println("The total Taxi Fee for " + distance + " meters is P" + totalFee);
    }
}
