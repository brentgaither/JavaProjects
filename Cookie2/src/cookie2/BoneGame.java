package cookie2;

import java.util.Random;

/*************************************************
 *           BoneGame
 * Object used by cookie 2. This class contains 3 constructors, 
 * play, clearYard, buryBones and findBone. BoneGame is created
 * and used in Cookie2.
 ************************************************/
public class BoneGame {

    private Random rand = new Random();
    private final int BONE = 1;
    final String[] spacer = {"", "                 ", "           "
                + " ","        ","         ",""};
    
    private int yard[][]; // Will be created in clearYard when called by play
    private int yardSize,
                numTrials,
                numBones;

    /**
     * ***********************************************
     *          BoneGame 
     * Constructor with no parameters.
     * ***********************************************
     */
    BoneGame() {

        setValues(50, 15, 3);
    }

    /**
     * ***********************************************
     *               BoneGame
     * Constructor with 1 parameter for the yard size.
     * ***********************************************
     */
    BoneGame(int yS) {

        if (yS > 50 || yS < 5) 
        {
            System.out.println("Invalid yard siz.e Yard size "
                    + "will be set to 50.");
            yS = 50;
        }
       
        setValues(yS, 15, 3);
    }

    /**
     * ***********************************************
     *              BoneGame 
     * Constructor with 3 parameters for yard size number of bones and
     * number of trials each with data validation.
     * ***********************************************
     */
    BoneGame(int size, int trials, int bones) {

        if (size > 50 || size < 5) {
            System.out.println("Invalid size yard size will be set to 50");
            size = 50;
        }
       
        if (trials > 100 || trials < 1) {
            System.out.println("Invalid number of trials. "
                    + "Trials will be set to 15.");
            trials = 15;
        }
       
        if (bones > 5 || bones < 1) {
            System.out.println("Invalid number of bones. "
                    + "3 bones will be used.");
            bones = 3;
        }
        
        setValues(size, trials, bones); 
      }
    /************************************************
                    setValues
    Used by constructors to set size trial and bone counts.
    ************************************************/
    private void setValues(int s, int t, int b)
    {
        yardSize = s;
        numTrials = t;
        numBones = b;
    }

    /**
     * ***********************************************
     *                      play 
     * Play is called by main in cookie. Calls clear yard, bury bones and
     * find bones. Sets up and displays the heading.
     * ***********************************************
     * 
     */
    public void play(int seed) {

        int numDigs;
        int totalDigs = 0;   // Initialize accumulator 
        double averageDigs = 0;
    

        rand.setSeed(seed);

        System.out.println("\n\n             Digging Up Bones --- Brent \n");
        System.out.println("Trial       Bone           Coordinates    "
                + "       Bone Found     #Holes");

        for (int trial = 1; trial <= numTrials; trial++) {
            System.out.printf("%2d  %s", trial,spacer[numBones]);

            clearYard();           //Resets the yard.

            buryBones();           //Buries the bones

            numDigs = findBone(); //Finds a bone in the yard
            totalDigs = totalDigs + numDigs;
        }
        averageDigs = (double) totalDigs / numTrials;
        System.out.printf("\n Average number of holes dug to find a "
                + "bone:  %.2f \n", averageDigs);
                
    }// end play

    /**
     * ***********************************************
     *                 clearYard 
     * Creates new yard to restore it back to all 0s.
     * ***********************************************
     */
    private void clearYard() {

        yard = new int[yardSize + 2][yardSize + 2];
    }

    /**
     * ***********************************************
     *                  buryBones 
     * Bury Bones places bones in a random spots in the yard.
     * ***********************************************
     */
    private void buryBones() {

        int yardCol,
            yardRow;

        for (int digs = 1; digs <= numBones; digs++) {
            yardRow = rand.nextInt(yardSize) + 1;
            yardCol = rand.nextInt(yardSize) + 1;

            yard[yardRow][yardCol] = BONE;
            System.out.printf(" (%2d" + ",%2d" + ") ", yardRow, yardCol);
        }
    }

    /**
     * **********************************************
     *              findBones
     * Find bones randomly looks for a bone in the yard.
     * **********************************************
     */
    private int findBone() {
    
        boolean found = false;
       
        //Offset arrays to search around the dig  spot
                                    //  X  UP   R  DOWN  L
        final int[] xOffSet = new int[]{0, -1,  0,  1,   0};
        final int[] yOffSet = new int[]{0,  0,  1,  0,  -1};
        
        int numDigs = 0;
        int digX = 0,
            digY = 0;

        do {
            digX = rand.nextInt(yardSize) + 1; 
            digY = rand.nextInt(yardSize) + 1;
            numDigs++;

            for (int i = 0; i < xOffSet.length && !found; i++) {/*Looks in yard 
                                         array with offset array to find bone*/
               
                if (yard[digX + xOffSet[i]][digY + yOffSet[i]] == BONE) {
                    System.out.printf("%s   (%2d,%2d" + ") ",spacer[numBones], 
                            digX + xOffSet[i], digY + yOffSet[i]);
                    found = true;
                }
            }

        } while (!found);
        
        System.out.printf("      %4d \n", numDigs);
        return numDigs;
    }
}//End BoneGame class