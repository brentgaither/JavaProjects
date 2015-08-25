package coins1;

/**
 *
 * Brent Gaither This program is a cash register that denotes to the cashier how
 * much money to pay in the largest denominations possible.
 */
import java.text.DecimalFormat;
import java.util.*;

public class Coins1 {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat format = new DecimalFormat("###.##");

    public static void main(String[] args) {//main calls vaildInput, 
        //CreateReport and makechange 

        //MIN and max for cash amounts
        final double MIN = 0.0,
                     MAX = 100.0;

        double purchaseAmt, //Input from user for price of item.
                //Input from user amount they paid.
               amtPaid;
        
        System.out.println("This is a cash register enter amount due and"
                + " amount paid for the largest denominations to pay out.");
        //Get initial purchase amount to enter sentinal control loop. 
        purchaseAmt = validInput("Please enter amount due or 0 to quit:  ",
                MIN, MAX);

        while (purchaseAmt > 0) { //Sentinal control loop.
            amtPaid = validInput("Please enter amount paid: ",
                    purchaseAmt, MAX);

            createReport(purchaseAmt, amtPaid);
            purchaseAmt = validInput("Please enter amount due or 0 to quit:  ",
                    MIN, MAX);
        }

    }

    /**
     * Validates the input for the user and verify input is between min and max
     *
     * @param string User prompt.
     * @param MIN Double lower bound for valid input.
     * @param MAX Double upper bound for valid input.
     * @return Returns validated user input.
     */
    private static double validInput(String string, double MIN, double MAX) {

        double input;

        System.out.print(string);
        //accepts input from user
        input = (double) keyboard.nextDouble();
        //Ensures values within range.
        while (input < MIN || input > MAX) {
            System.out.print("please enter a amount between " + MAX
                    + " and " + MIN + ": ");
            input = (double) keyboard.nextDouble();
        }
        return input;
    }

    /**
     * Creates the heading of the report given to the user.
     *
     * @param purchaseAmt
     * @param amtPaid
     */
    private static void createReport(double purchaseAmt, double amtPaid) {
        /*This method creates the output for the user. 
         * It also calculates change due.*/

        double changeDue;

        System.out.println("Amount paid:    $" + amtPaid);
        System.out.println("Amount due:      " + purchaseAmt);

        //Determines how much money is owed.
        changeDue = amtPaid - purchaseAmt;

        changeDue = Double.parseDouble(format.format(changeDue));

        System.out.print("change Due      $" + changeDue + "\n");

        //Stops pay as if no change is due.
        if (changeDue > 0) {
            makeChange(changeDue);
        }
    }

    /**
     * Calculates and displays the largest denominations for the user.
     *
     * @param changeDue amount of money due denominations calculated
     */
    private static void makeChange(double changeDue) {
        int[] denominations;
        int i = 0; //Loop iterator.

        denominations = new int[8];
        denominations[0] = 2000;
        denominations[1] = 1000;
        denominations[2] = 500;
        denominations[3] = 100;
        denominations[4] = 25;
        denominations[5] = 10;
        denominations[6] = 5;
        denominations[7] = 1;

        Map<Integer, String> map = new HashMap();
        map.put(0, "Twenty dollar bill(s)");
        map.put(1, "Ten dollar bill(s)");
        map.put(2, "Five dollar bill(s)");
        map.put(3, "One dollar bill(s)");
        map.put(4, "Quarter(s)");
        map.put(5, "Dime(s)");
        map.put(6, "Nickel(s)");
        map.put(7, "Penny(s)");

        //Quanity of each specfic denomination.
        double change;

        changeDue = changeDue * 100;
        
        System.out.println("pay as:");
        while (changeDue > 0) {

            if (changeDue >= denominations[i]) {
                change = (int) changeDue / denominations[i];
                changeDue = changeDue % denominations[i];//Remaining change.
                System.out.println("                " + (int) change + " "
                        + map.get(i));
            }
            i++;
        }

    }
}
