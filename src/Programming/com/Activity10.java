package Programming.com;

import java.util.Scanner;

public class Activity10 {
    public static void tax() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Gross Salary of Employee : ");
        double grossSalary = scan.nextDouble();

        double tax = calculatedTax(grossSalary);
        System.out.println("The tax to pay: P" + tax);
    }

    public static double calculatedTax(double grossSalary) {
        double tax;

        if(grossSalary <= 50000) {
            tax = grossSalary *0.10;
        } else if(grossSalary <= 100000) {
            tax = 5000 + grossSalary * 0.15;
        } else if(grossSalary <= 200000) {
            tax = 15000 + grossSalary * 0.20;
        } else {
            tax = grossSalary * 0.25;
        }
        return tax;
    }
}
