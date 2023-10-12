package Programming.com;

import java.util.Scanner;

public class Activity9 {
    public static void xyaxis() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x-axis : ");
        int x = scan.nextInt();

        System.out.print("Enter y-axis : ");
        int y = scan.nextInt();

        if(x == 0 && y == 0) {
            System.out.println("The point is in Origin");
        }else if(x > 0) {
            System.out.println("The point lies on y-axis");
        } else if(y > 0) {
            System.out.println("The point lies on x-axis");
        } else if(x > 0 && y > 0) {
            System.out.println("The point is in Quadrant I");
        } else if(x < 0 && y > 0) {
            System.out.println("The point is in Quadrant II");
        } else if(x < 0 && y < 0) {
            System.out.println("The point is in Quadrant III");
        } else {
            System.out.println("The point is Qadrant IV");
        }
    }
}
