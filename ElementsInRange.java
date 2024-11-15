import java.util.Scanner;

public class ElementsInRange {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input
        int numValues = scnr.nextInt();
        for(int i = 0; i < numValues; ++i){
            userValues[i] = scnr.nextInt();
        }
        int lowerBound = scnr.nextInt();
        int upperBound = scnr.nextInt();
        for(int i = 0; i <= numValues - 1; ++i){
            if(userValues[i] >= lowerBound && userValues[i] <= upperBound){
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println();
    }
}
