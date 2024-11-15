import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[9];  // Set of data specified by the user

        int numElements;
        int userInput = scnr.nextInt();
        int i = 0;
        boolean tooMany = false;
        while (userInput >= 0){
            if(i >= 9){
                System.out.println("Too many inputs");
                tooMany = true;
                break;
            }
            userValues[i] = userInput;
            i++;
            userInput = scnr.nextInt();
        }
        if(!tooMany){
            System.out.println(userValues[(i - 1) / 2]);
        }

    }
}
