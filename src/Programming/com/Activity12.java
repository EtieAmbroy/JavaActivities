package Programming.com;

import java.util.Scanner;

public class Activity12 {
    public static void reverseString() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Line Word: ");
            String input = scan.nextLine();

            if("tiuq".equals(input)) {
                System.out.println("Exiting the program");
                break;
            }

            String reversed = reverseString(input);
            System.out.println("Reversed : " + reversed);
        }


    }
    static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
