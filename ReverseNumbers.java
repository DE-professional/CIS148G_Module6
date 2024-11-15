import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userList = new int[20];   // List of numElement integers specified by the user
        int numElements;                // Number of integers in user's list
        int [] tempArray = new int[20];
        // Add more variables as needed

        numElements = scnr.nextInt();   // Input begins with number of integers that follow

        for(int i = 0; i < numElements; ++i){
            userList[i] = scnr.nextInt();
        }
        for(int i = numElements - 1; i >= 0; --i) {
            int j = 0;
            tempArray[j] = userList[i];
            System.out.print(tempArray[j] + " ");
            ++j;
        }
        System.out.println();




    }
}
