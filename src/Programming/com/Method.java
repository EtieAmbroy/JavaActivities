package Programming.com;

import java.util.*;

public class Method {

        int n = -1;
    public Method() {
        Activity1 a = new Activity1();
        Activity2 b = new Activity2();
        Activity3 c = new Activity3();
        Activity4 d = new Activity4();
        Activity5 e = new Activity5();
        Activity6 f = new Activity6();
        Activity7 g = new Activity7();
        Activity8 h = new Activity8();
        Activity9 act9 = new Activity9();
        Activity10 j = new Activity10();
        Activity11 k = new Activity11();
        Activity12 l = new Activity12();
        Activity13 m = new Activity13();
        Activity14 act14 = new Activity14();
        Activity15 o = new Activity15();
        Activity16 p = new Activity16();
        Activity17 q = new Activity17();
        Activity18 r = new Activity18();
        Activity19 s = new Activity19();

        Scanner scanInt = new Scanner(System.in);
        int n = -1;

        do {
            System.out.println();
            System.out.println("Enter a number of Activities you want to Open");
            System.out.println("0 to Exit the program ");

            for( int i = 0; i < 19; i++) {
                System.out.println((i + 1) + " For Activtity " + (i +1));
            }
            System.out.println();
            System.out.print("Enter a your choice : ");

             n = scanInt.nextInt();

            if( n == 0) {
                System.out.print("Exiting The Program");
                break;
            }

        switch (n) {
            case 1 :
                System.out.println("Acitivy 1 output");a.printLine(); break;
            case 2 :
                System.out.println("Activity 2 output ");b.squareBrackets();break;
            case 3 :
                System.out.println("Activity 3 output ");c.Static();break;
            case 4 :
                System.out.println("Activity 4 output");d.Hello(); break;
            case 5 :
                System.out.println("Acitivity 5 Output");e.SodaInLiters();break;
            case 6 :
                System.out.println("Acitivity 6 Output");f.totalSeconds();break;
            case 7 :
                System.out.println("Acitivity 7 Output");g.distance(); break;
            case 8 :
                System.out.println("Acitivity 8 Output");h.year(); break;
            case 9 :
                System.out.println("Acitivity 9 Output");act9.xyaxis(); break;
            case 10 :
                System.out.println("Acitivity 10 Tax");j.tax(); break;
            case 11 :
                System.out.println(" Acitivity 11 About Fibonacci Sequence"); k.Fibonacci(); break;
            case 12 :
                System.out.println("Acitivity 12 Reverse String");l.reverseString(); break;
            case 13 :
                System.out.println("Acitivity 13 Output");m.FizzBuzz(); break;
            case 14 :
                System.out.println("Acitivity 14 Number to Words");act14.numberToWords();break;
            case 15 :
                System.out.println("Acitivity 15 Ascending or Descending");o.AscendingDescending(); break;
            case 16 :
                System.out.println("Acitivity 16 Output");p.validCode(); break;
            case 17 :
                System.out.println("Acitivity 17 Output");q.scoreFromJudges(); break;
            case 18 :
                System.out.println("Acitivity 18 Sum Of Array");r.sumOfArray(); break;
            case 19 :
                System.out.println("Reverse Array"); s.ReverseArray(); break;

        }
        }while(n != 0);



    }
    public static void main(String[] args) {

        Method m = new Method();

    }
}
