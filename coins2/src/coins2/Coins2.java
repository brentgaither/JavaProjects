/**
 *
 * @author brentgaither This program is a cash register. It has a class that
 * creates the denominations needed for the change due.
 */
package coins2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Coins2 {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat format = new DecimalFormat("###.##");
    static String[] labels = {"Twenty dollar bill(s)", "Ten dollar bill(s)",
        "Five dollar bill(s)", "One dollar bill(s)", "Quarter(s)", "Dime(s)",
        "Nickel(s)", "Penny(s)",};
    static int[] denominations = {2000, 1000, 500, 100, 25, 10, 5, 1};
    static double changeDue = 0;

    public static void main(String[] args) {

        ChangeMaker makeChange = new ChangeMaker(labels, denominations);
        //MIN and max for cash amounts
        final double MIN = 0.0,
                MAX = 100.0;

        double purchaseAmt,
                amtPaid;

        System.out.println("This is a cash register. Enter amount due and"
                + " amount paid for a customer purchase.");

        purchaseAmt = validInput("Please enter amount due or 0 to quit:  ",
                MIN, MAX);

        while (purchaseAmt > 0) { /*Loop so long as the end
             sentinal has not been entered.*/

            amtPaid = validInput("Please enter amount paid: ",
                    purchaseAmt, MAX);

            changeDue = createReport(purchaseAmt, amtPaid);

            if (changeDue > 0.0) {

                makeChange.makeChange(changeDue);
            }
                purchaseAmt = validInput("Please enter amount due or"
                        + " 0 to quit:  ", MIN, MAX);
            
        }

    }

    /**
     * Validates that the input for the user and verify 
     * input is between min and max
     *
     * @param string User prompt.
     * @param MIN Double lower bound for valid input.
     * @param MAX Double upper bound for valid input.
     * @return Returns validated user input.
     */
    private static double validInput(String prompt, double MIN, double MAX) {

        double input;

        System.out.print(prompt);

        input = keyboard.nextDouble();

        while (input < MIN || input > MAX) {
            System.out.print("please enter a amount between " + MAX
                    + " and " + MIN + ": ");
            input = keyboard.nextDouble();
        }
        return input;
    }

    /**
     * Creates the heading of the report given to the user.
     *
     * @param purchaseAmt
     * @param amtPaid
     */
    private static double createReport(double purchaseAmt, double amtPaid) {
        /*This method creates the output report for the user. */

        double changeDue = 0;
        //ChangeMaker makeChange = new ChangeMaker(labels, denominations);
        System.out.printf("Amount paid:    $ %6.2f \n", amtPaid);
        System.out.printf("Amount due:       %6.2f \n", purchaseAmt);

        //Determines how much money is owed.
        changeDue = amtPaid - purchaseAmt;

        changeDue = Double.parseDouble(format.format(changeDue));

        System.out.printf("change Due      $ %6.2f \n", changeDue);

        return changeDue;

    }
}

/* 
Tests for instructors cases.
This is a cash register. Enter amount due and amount 
paid for a customer purchase.
Please enter amount due or 0 to quit:  2.08
Please enter amount paid: 50
Amount paid:    $  50.00 
Amount due:         2.08 
change Due      $  47.92 
                2 Twenty dollar bill(s)
                1 Five dollar bill(s)
                2 One dollar bill(s)
                3 Quarter(s)
                1 Dime(s)
                1 Nickel(s)
                2 Penny(s)
Please enter amount due or 0 to quit:  2.74
Please enter amount paid: 10
Amount paid:    $  10.00 
Amount due:         2.74 
change Due      $   7.26 
                1 Five dollar bill(s)
                2 One dollar bill(s)
                1 Quarter(s)
                1 Penny(s)
Tests for multiple bad inputs
Please enter amount due or 0 to quit:  101
please enter a amount between 100.0 and 0.0: -1
please enter a amount between 100.0 and 0.0: 56
Please enter amount paid: 101
please enter a amount between 100.0 and 56.0: -1
please enter a amount between 100.0 and 56.0: 70.54
Amount paid:    $  70.54 
Amount due:        56.00 
change Due      $  14.54 
                1 Ten dollar bill(s)
                4 One dollar bill(s)
                2 Quarter(s)
                4 Penny(s)
Tests for amount paid more than amount due.
Please enter amount due or 0 to quit:  50
Please enter amount paid: 45
please enter a amount between 100.0 and 50.0: 55.45
Amount paid:    $  55.45 
Amount due:        50.00 
change Due      $   5.45 
                1 Five dollar bill(s)
                1 Quarter(s)
                2 Dime(s)
Tests for change due is zero.
Please enter amount due or 0 to quit:  45.45
Please enter amount paid: 45.45
Amount paid:    $  45.45 
Amount due:        45.45 
change Due      $   0.00 
Tests for upper and lower limit up bounds.
Please enter amount due or 0 to quit:  1
Please enter amount paid: 10
Amount paid:    $  10.00 
Amount due:         1.00 
change Due      $   9.00 
                1 Five dollar bill(s)
                4 One dollar bill(s)
Please enter amount due or 0 to quit:  100
Please enter amount paid: 100
Amount paid:    $ 100.00 
Amount due:       100.00 
change Due      $   0.00 
Please enter amount due or 0 to quit:  0*/