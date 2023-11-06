import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int numberToGuess;
        int attempts = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            int maxAttempts = 10; // You can adjust the maximum attempts as needed

            System.out.println("I've selected a random number between " + minRange + " and " + maxRange + ". Try to guess it!");

            for (attempts = 1; attempts <= maxAttempts; attempts++) {
                System.out.print("Attempt " + attempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < numberToGuess) {
                    System.out.println("Your guess is too low.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                    roundsWon++;
                    break;
                }
            }

            System.out.println("Round over. You took " + attempts + " attempts.");

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Game over. Rounds won: " + roundsWon);
                break;
            }
        }

        scanner.close();
    }
}