package Programming.com;

import java.util.*;

public class Activity17 {
    public static void scoreFromJudges() {
        Scanner scan = new Scanner(System.in);
        double scores[] = new double[10];

        for(int i = 0; i < 10; i++) {
            System.out.print("Enter score from judge " + (i+1) + " : ");
            scores[i] = scan.nextDouble();
        }
        double finalScore = calculatedFinalScore(scores);
        System.out.print("Final Score : " + finalScore);

    }
    static double calculatedFinalScore(double scores[]) {
        Arrays.sort(scores);

        double sum = 0;
        for(int i = 1;i < 9; i++) {
            sum += scores[i];
        }
        double average = sum/8;

        return average;
    }
}
