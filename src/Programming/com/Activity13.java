package Programming.com;

public class Activity13 {
    public static void FizzBuzz() {
        for(int i = 0; i <= 50; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            }else if (i % 5 == 0 ) {
                System.out.println(i + " Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
