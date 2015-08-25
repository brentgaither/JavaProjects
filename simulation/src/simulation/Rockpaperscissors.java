package simulation;

/**
 *
 * @author brentgaither This program is a virtual rock paper scissors.
 */
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {

    static Scanner keyboard = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rand = new Random();

        int compMove,
                userMove,
                decide,
                pointsComp = 0,
                pointsPlayer = 0;
        HashMap map = new HashMap();
        // Put elements to the map
        map.put(1, "rock");
        map.put(2, "paper");
        map.put(3, "scissors");

        HashMap winner = new HashMap();
        winner.put(4, "tie");
        winner.put(5, "Paper covers rock");
        winner.put(6, "Rock beats scissors");
        winner.put(7, "Paper covers rock");
        winner.put(8, "tie");
        winner.put(9, "Scissors cut paper");
        winner.put(10, "Rock beats scissors");
        winner.put(11, "Scissors cut paper");
        winner.put(12, "tie");

        do {
            // Generates a random number between 1 and 3
            compMove = rand.nextInt(9999) % 3 + 1;

            userMove = (int) validInput();

            decide = (userMove * 3) + compMove;
            if (userMove == compMove) {
                System.out.println("I chose " + map.get(compMove)
                        + " too " + "its a tie");
            } else if (decide == 5 || decide == 9 || decide == 10) {
                pointsComp++;
                System.out.println("I chose " + map.get(compMove)
                        + ", " + winner.get(decide) + " Computer wins!");
            } else {
                pointsPlayer++;
                System.out.println("I chose " + map.get(compMove)
                        + ", " + winner.get(decide) + " you win!");
            }

        } while (pointsComp < 5 && pointsPlayer < 5);
        System.out.println("Let's see how you did :");
        System.out.println("You won " + pointsPlayer
                + " and I won " + pointsComp + " points.");
    }

    /**
     *
     * Validates the input for the user and verify input is between 1 and 3.
     * Returns the input to main
     *
     */
    private static double validInput() {

        int input;

        System.out.print("Enter 1 (rock), 2 (paper), 3 (scissors) ");
        //accepts input from user
        input = (int) keyboard.nextInt();
        //Ensures values within range.
        while (input < 1 || input > 3) {
            System.out.print("please enter a amount between 1 and 3: ");
            input = (int) keyboard.nextInt();
        }
        return input;
    }
}
