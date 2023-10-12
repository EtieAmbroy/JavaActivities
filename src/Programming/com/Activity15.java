package Programming.com;

import java.util.*;
public class Activity15 {
    public static void AscendingDescending() {
        Scanner scan = new Scanner(System.in);
        int numbers[] = new int[10];

        System.out.print("Enter 10 Digit : ");
        for(int i = 0; i < 10; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("Ascending<a> or Descending<d> : ");
        char choice = scan.next().charAt(0);

        if(choice == 'a' || choice == 'A') {
            Arrays.sort(numbers);
            System.out.println("Number is in Ascending Order");
        } else if(choice == 'd' || choice == 'D') {
            Arrays.sort(numbers);

            for (int i = 0; i < numbers.length / 2; i++) {
                int temp = numbers[i];
                numbers[i] = numbers[numbers.length - 1 - i];
                numbers[numbers.length - 1 - i] = temp;
            }
            System.out.println("Number is in Descending Order");
        }else {
            System.out.println("Invalid Input. Please Enter <a> for Ascending and <d> for Descending");
        }

        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
