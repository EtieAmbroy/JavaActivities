package Programming.com;

public class Activity18 {
    public static void sumOfArray() {
        int numbers[] = {1,2,3,4,5};
        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of the numbers in Array " + sum);
    }
}
