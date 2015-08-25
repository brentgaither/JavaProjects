package towerofhanoi;

/**
 * ********************************************
 * Hanoi.java This class, when completed will display a solution to the Towers
 * of Hanoi problem. Completed by Brent Gaither Travis Morrison
 *********************************************
 */
public class TowerOfHanoi {

    int numMoves = 0;
    int numCalls = 0;
    private int numDiscs;   // Number of discs

   // CONSTRUCTORS
    public TowerOfHanoi() {
        numDiscs = 3;
        moveDiscs(numDiscs, 1, 3, 2);
        // this(3);
    }

    public TowerOfHanoi(int n) {
        numDiscs = n;

      // Make the initial call to the recursive method that 
        // will move the specified number of discs from peg 1 
        // to peg 3, using peg 2 as a temporary storage location.
        moveDiscs(numDiscs, 1, 3, 2);

    }

    /* **********************************************             
     moveDisks
     The moveDiscs method displays a disc move.
     ***********************************************/
    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg) {
        
        numCalls++;
        
        if (num > 0) {

            moveDiscs(num - 1, fromPeg, tempPeg, toPeg);
         // Write a recursive call HERE to move the num-1 
            // disks that are ABOVE the bottom one on the
            // "from" peg OFF OF HIM and onto the "temp" peg.
            // Be sure to note the order of the parameters.

            System.out.println("Move a disc from peg " + fromPeg
                    + " to peg " + toPeg);
            numMoves++;
            
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
         // Now write a recursive call HERE to move all the 
            // num-1 disks previously moved to the "temp" peg 
            // back onto the disk you have moved to the "to" peg. 
        }
        // else do nothing. Just return
    }

}
