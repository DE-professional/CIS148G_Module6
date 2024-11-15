import java.util.Scanner;

public class TwoSmallest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input
        int numValues = scnr.nextInt();
        int smallestNum;
        int secondSmallest;
        for(int i = 0; i < numValues; ++i){
            userValues[i] = scnr.nextInt();
        }
        smallestNum = Integer.MAX_VALUE;
        secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i <  numValues; ++i){
            if(userValues[i] < smallestNum){
                smallestNum = userValues[i];
            }


        }
        for(int i = 0; i < numValues; ++i){
            if(userValues[i] > smallestNum && userValues[i] < secondSmallest){
                secondSmallest= userValues[i];
            }


        }
        System.out.print(smallestNum + " " + secondSmallest);
        System.out.println();
    }
}
