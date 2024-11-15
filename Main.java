import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int[] userValues = new int[10];
        int i;

        for (i = 0; i < 10; ++i) {
            userValues[i] = scnr.nextInt();
        }
        int minVal = userValues[0];
        int maxVal = userValues[0];
        int sumVal = 0;

        for(int number : userValues) {
            if (number > maxVal) {
                maxVal = number;
            }
            if (number < minVal) {
                minVal = number;
            }
            sumVal += number;
        }
        System.out.print(minVal + " " + maxVal + " " +  (sumVal / 10.0));
        System.out.println("");

    }
}

