package academy.learnprogramming;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

        String playerChoice;
        int playerValue = -1;
        int computerValue = randomGenerator.nextInt(3);

        System.out.println("Please enter rock, paper or scissors ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (playerChoice.equals("rock")) {
            playerValue = ROCK;
        }
        if (playerChoice.equals("paper")) {
            playerValue = PAPER;
        }
        if (playerChoice.equals("scissors")) {
            playerValue = SCISSORS;
        }

        System.out.printf("Player chose %s, the value is %s.%n", playerChoice, playerValue);
        scanner.close();
    }
}
