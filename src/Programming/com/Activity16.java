package Programming.com;

import java.util.Scanner;

public class Activity16 {
    public static void validCode() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a code : ");
        String code = scan.nextLine();

        if(isValidCode(code)){
            System.out.println("Valid Code");
        } else  {
            System.out.println("Invalid Input");
        }

    }
    static boolean isValidCode(String code) {
        if(code.length() > 5) {
            return false;
        }
        if(code.length()==0 || !Character.isLetter(code.charAt(0))) {
            return false;
        }
        if(!code.endsWith("*")) {
            return false;
        }

        for(int i = 0; i < code.length()-1; i++) {
            char currentChar = code.charAt(i);
            if(!Character.isLetter(currentChar) || !Character.isDigit(currentChar)){
                return false;
            }
        }
            return true;
    }
}
