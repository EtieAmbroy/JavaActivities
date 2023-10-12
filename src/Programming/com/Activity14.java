package Programming.com;

import java.util.*;

public class Activity14 {
    static String units[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    static String teens[] = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String tens[] = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    static String convertToWords(int num) {
        if (num == 0) {
            return "zero";
        }

        return convert(num);
    }

    static String convert(int num) {
        if (num < 10) {
            return units[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + convert(num % 10);
        } else if (num < 1000) {
            return units[num / 100] + " hundred " + convert(num % 100);
        } else if (num < 1000000) {
            return convert(num / 1000) + " thousand " + convert(num % 1000);
        } else if (num < 1000000000) {
            return convert(num / 1000000) + " million " + convert(num % 1000000);
        } else {
            return "Number out of range";
        }
    }

    public static void numberToWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Digit - ");
        int num = scanner.nextInt();

        if (num < 0 || num > 999999999) {
            System.out.println("Number out of range.");
        } else {
            String words = convertToWords(num);
            System.out.println("Output: " + words);
        }
    }
}