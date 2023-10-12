package Programming.com;
import java.util.*;
public class Methods {

    public static void main(String[] args) {
        // Instantiate
        Methods h = new Methods();
    }

    // Default constructor
    public Methods() {
        Scanner scanINt = new Scanner(System.in);
        Scanner scanFloat = new Scanner(System.in);

        int n = -1;

        // Iterate the Choices
        do {

            System.out.println("Simple Calculator");
            System.out.println("[1] - Addition");
            System.out.println("[2] - Subtraction");
            System.out.println("[3] - Multiplication");
            System.out.println("[4] - Division");
            System.out.println("[0] - Exit");
            System.out.print("Enter Choice : ");
            n = scanINt.nextInt();

            if(n == 0) {
                System.out.println("System exit");
                break;
            }

            System.out.println("Enter 2 Numbers to calculate");
            System.out.print("Enter num1 :");
            float num1 = scanINt.nextFloat();
            System.out.print("Enter num2 :");
            float num2 = scanFloat.nextFloat();

            // num1 & num2 are arguments
            switch(n) {
                case 1 : System.out.println("Sum : "+ addition(num1, num2)); break;
                case 2 : System.out.println("Answer : "+ subtraction(num1, num2)); break;
                case 3 : System.out.println("Product : "+ multiplication(num1, num2)); break;
                case 4 : System.out.println("Answer : "+ division(num1, num2)); break;
            }

        }while(n != 0);
    }

    // methods in java with parameters
    private float addition(float num1, float num2) {
        return num1 + num2;
    }

    public float subtraction(float x, float y) {
        return x - y;
    }

    public float multiplication(float x, float y) {
        return x * y;
    }

    public float division(float x, float y) {
        return x / y;
    }
}
