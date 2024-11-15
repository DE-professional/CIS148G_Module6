import java.util.Scanner;

public class ContainsTheCharacter {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String[] userValues = new String[20];  // Set of data specified by the user
        int numElements;
        int numWords = scnr.nextInt();
        char searchChar = 'b';

        for(int i = 0; i <= numWords; ++i){
            if(i == numWords){
                searchChar =  scnr.next().charAt(0);
            }
            else{
                userValues[i] = scnr.next();
            }
        }
        for(int i = 0; i < numWords; ++i){
            if(userValues[i].indexOf(searchChar) != -1){
                System.out.println(userValues[i]);
            }
        }
    }
}
