package Programming.com;

import java.util.Scanner;

public class Activity4 {
    public static void Hello() {
        System.out.println("Hello , my name is Emmanuel ");
        System.out.print("What is your name? ");

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        System.out.println("Hello , " + name);
    }
}
