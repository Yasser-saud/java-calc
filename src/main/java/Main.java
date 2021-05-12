import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calc calc = new Calc();
        int userInput;
        float a;
        float b;
        int restart;

        // keep running until user wants to exit
        while (true){
            System.out.println("Welcome! 😊 \nPlease use the number corresponding for the action you want.");

            // options
            System.out.println(" 1 - sum two numbers \n 2 - subtract two numbers \n 3 - multiply two numbers \n 4 - divide two numbers \n 5 - Exit");

            // input
            if(s.hasNextInt()){
                userInput = s.nextInt();
            }

            else {
                System.err.println("Error: Please enter a valid number!");
                s.next();
                continue;
            }

            if( userInput > 5){
                System.err.println("The number you entered is out of the range! \n Restarting...");
                continue;
            }

            else if( userInput == 5){
                System.out.println("Exiting...");
                break;
            }

            // else take input from the user
            else {
                // loop until a valid value is provided
                while (true){
                    try {
                        System.out.println("Please enter the first number: ");
                        a = s.nextInt();
                        System.out.println("Please enter the second number: ");
                        b = s.nextInt();
                        break;
                    }
                    catch (InputMismatchException e){
                        System.err.println("Error: Please enter a valid number!");
                        s.next();
                        continue;
                    }
                }

                if(userInput == 1){
                    calc.sum(a, b);
                }
                else if(userInput == 2){
                    calc.subtract(a, b);
                }
                else if(userInput == 3){
                    calc.multiply(a, b);
                }
                else {
                    calc.divide(a, b);
                }

                while (true){
                    try {
                        System.out.println("Want to try again? \n 1 - Yes \n Any other number - No/Exit");
                        restart = s.nextInt();
                        break;
                    }
                    catch (InputMismatchException e){
                        s.next();
                        continue;
                    }
                }

                if(restart == 1){
                    continue;
                }

                else {
                    System.out.println("Exiting...");
                    break;
                }
            }
        }

    }

}
