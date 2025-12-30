import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("📉 Too high! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("📈 Too low! Try again.");
            } else {
                System.out.println("🎉 Congratulations! You guessed the correct number.");
                System.out.println("🔢 Total attempts: " + attempts);
            }

        } while (guess != randomNumber);

        sc.close();
    }
}
