import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input
        int numValues = scnr.nextInt();
        int gateNum = 0;
        for(int i = 0; i <= numValues; ++i){
            if(i == numValues){
                gateNum = scnr.nextInt();
            }
            else{
                userValues[i] = scnr.nextInt();
            }
        }
        for(int i = 0; i < numValues; ++i){
            if(userValues[i] <= gateNum){
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println();

    }
}
