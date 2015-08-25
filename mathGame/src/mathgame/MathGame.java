/*
 * This program creates a random linear algebra equation in the form
 * ax + b = c. It repeats 10 times and asks to play again.
 */
package mathgame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brentgaither
 */
public class MathGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
           
         double numA = 0,//corresponds to each of the variables in the equation
                numB = 0,
                numC = 0,
                points = 0;//number of correct responses
         double answer,
                playerAnswer = 0;
         String again = "y"; //used for play again loop
         
         do {
        for (int i = 1; i<10; i++)
        {
            // Generates a random number between 0 and 2
            numA = rand.nextInt(9999) % 2 + 1;
            numB = rand.nextInt(41) - 20;
            numC = rand.nextInt(41) - 20;
            answer = (numC - numB)/numA; //calculates correct answer
            System.out.print(numA+ "x  + " +numB +" = " +numC + "    ... X=");
            playerAnswer = keyboard.nextDouble();

            if (answer == playerAnswer) {
                System.out.println("Correct!");
                points++;
            }
            else 
            {
                System.out.println("Sorry, correct answer is " + answer);
            }   
        }     
      
        System.out.println("You got " + points + " right out of ten.");
        System.out.println("Want to do 10 more questions (y/n)");
        keyboard.nextLine(); //flushes enter
        again = keyboard.nextLine();
        } while (again.equalsIgnoreCase("y")); /*repeats game 
                                                 if user chooses to.*/
    }

}

