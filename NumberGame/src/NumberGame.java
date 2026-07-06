import java.util.Random;
import java.util.Scanner;

abstract class Game {
    public abstract void startGame();
}

class Guess {
    private int secretNumber;
    private int attempts;

    public Guess() {
        resetGame();
    }

    public void resetGame() {
        Random random = new Random();
        secretNumber = (random.nextInt(50) + 1) * 2;
        attempts = 0;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getAttempts() {
        return attempts;
    }

    public void increaseAttempts() {
        attempts++;
    }
}

class NumberGuessingGame extends Game {
    private Guess guess;
    private Scanner sc;

    public NumberGuessingGame() {
        guess = new Guess();
        sc = new Scanner(System.in);
    }

    @Override
    public void startGame() {
        char choice;

        do {
            guess.resetGame();

            System.out.println("\n========== Number Guessing Game ==========");
            System.out.println("Guess a number between 1 and 100.");
            System.out.println("You have only 5 attempts.");

            while (guess.getAttempts() < 5) {
                System.out.print("\nEnter your guess: ");
                int userGuess = sc.nextInt();

                guess.increaseAttempts();

                if (userGuess == guess.getSecretNumber()) {
                    System.out.println("\nCongratulations! You guessed the correct number.");
                    System.out.println("Attempts used: " + guess.getAttempts());
                    break;
                } else if (userGuess < guess.getSecretNumber()) {
                    System.out.println("Too Low!");
                } else {
                    System.out.println("Too High!");
                }

                System.out.println("Attempts Left: " + (5 - guess.getAttempts()));
            }

            if (guess.getAttempts() == 5) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + guess.getSecretNumber());
            }

            System.out.print("\nDo you want to play again? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'N');

        System.out.println("\nThank you for playing!");
        sc.close();
    }
}

public class NumberGame {
    public static void main(String[] args) {
        Game game = new NumberGuessingGame();
        game.startGame();
    }
}