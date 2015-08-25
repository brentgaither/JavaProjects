package coins2;

/**
 *
 * @author brentgaither
 */
public class ChangeMaker {

    String labels[];

    int[] denominations;

    public ChangeMaker(String[] l, int[] d) {
        labels = l;
        denominations = d;
    }

    void makeChange(double changeDue) {
        int i = 0,
                numDenoms;

        changeDue = changeDue * 100;
        while (changeDue > 0.0) {

            if (changeDue >= denominations[i]) {
                numDenoms = (int) changeDue / denominations[i];
                changeDue = changeDue % denominations[i];//Remaining change.
                System.out.println("                " + numDenoms + " "
                        + labels[i]);
            }
            i++;
        }

    }

}
