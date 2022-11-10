import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int chosenNumber = 56;
        // Prompt for user input
        System.out.println("What is the secret number??");

        // Collect user input
        Scanner reader = new Scanner(System.in);
        int userGuess = Integer.parseInt(reader.nextLine());

        // Output user response
        System.out.println("You guessed: " + userGuess);

        // if guess matches assigned secret number, print "Congrats!"
        // else if higher, print "too high"
        // else if lower, print "too low"

        if (userGuess == chosenNumber) {
            System.out.println("Spot on! You got it!");
        } else if (userGuess > chosenNumber) {
            System.out.println("Not quite, you're too high");

        } else if (userGuess < chosenNumber) {
            System.out.println("A little low this time, try again");
        }

    }
}
