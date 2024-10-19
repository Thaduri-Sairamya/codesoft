import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int numberToGuess=random.nextInt(100)+1;
        int numberOfTries=0;
        int guess;
        boolean win=false;
        System.out.println("hi!  here the Number Guessing Game");
        System.out.println("i have picked a number between 1 and 100..Try to guess it ");
        while(!win ){
            System.out.println("Enter your guess:");
            guess=scanner.nextInt();
            numberOfTries++;
            if (guess<numberToGuess)
            {
                System.out.println("Too low ! please try again");
            }
            else if (guess>numberToGuess)
            {
                System.out.println("Too high ! please try again");
            }
            else {
                win =true;
                System.out.println("congratulations! you have guessed the number  in "+numberOfTries+"tries");
            }
        }
        scanner.close();
    }
}
