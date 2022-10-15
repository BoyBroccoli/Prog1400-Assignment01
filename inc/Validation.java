package inc;
import java.util.Scanner;

public class Validation {

    public static int validateInput(){
        Scanner scan = new Scanner(System.in);
        int userValue=0;
        boolean validInput = false;
        String errorMessage = "Please only enter a positive number: ";

            do {
                if(scan.hasNextInt()){ // prompting user to input value
                    userValue = scan.nextInt(); // if above value is an int, then store in userValue
                    validInput = true; // exit loop

                }else { // if not an int
                    System.out.println(errorMessage);
                    validInput = false;
                    scan.next();
                }
            } while(validInput == false); // continue loop until validInput is true

            if(userValue < 0) {
                System.out.println(errorMessage);
                scan.nextLine();
            }   
        return userValue;
    }

    
}
