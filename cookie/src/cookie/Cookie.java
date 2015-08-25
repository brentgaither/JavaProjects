package cookie;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brentgaither
 */
public class Cookie {

    static int yard[][] = new int[52][52];
    static int yardCol,
               yardRow;
    static int findX;
    static int findY;

    static Random rand;
    /*   Main calls clear yard, bury bones and find bones. 
     */

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int numTrials = 15;

        int numDigs = 0;
        int seed; //User input used to set up random number generator.

        String again = "y"; //Used to play again

        double totalDigs;
        double averageDigs;
        
        System.out.println("Welcome to digging up bones!");
        do {
            totalDigs = 0;//resets dig counts
            averageDigs = 0;
            System.out.print("Please enter an integer to use as a "
                    + "seed for simulation: ");
            seed = keyboard.nextInt();
            rand = new Random(seed);
            System.out.println("             Digging Up Bones --- Brent");
            System.out.println("Trial       Bone    Coordinates    "
                    + "Bone Found    #Holes");

            for (int i = 1; i <= numTrials; i++) {
                System.out.printf("%2d         ", i);
                numDigs = 0;
                clearYard(); //Resets the yard.

                for (int k=1; k<=3; k++)
                {
                buryBones();
                System.out.printf("(%2d" + ",%2d" + ")", yardRow, yardCol);
                }
                
                numDigs = findBones();
                totalDigs = totalDigs + numDigs;

                System.out.printf("      %4d \n", numDigs);
            }
            averageDigs = totalDigs / numTrials;
            System.out.printf("Average number of holes dug to find a "
                    + "bone:  %.2f \n",
                    averageDigs);

            System.out.print("Want to play again? (y/n) ");
            keyboard.nextLine(); //flushes enter
            again = keyboard.nextLine();
        } while (again.equalsIgnoreCase("y"));
    }
    /* Clear yard restores the yard back to all 0s.  
     */

    private static int[][] clearYard() {

        yard = new int[52][52];

        return (yard);
    }
    /*
     Bury Bones places a bone in a random spot in the yard.
     */

    private static int[][] buryBones() {

        yardRow = rand.nextInt(51) + 1;
        yardCol = rand.nextInt(51) + 1;

        yard[yardRow][yardCol] = 1;

        return yard;

    }
    /*
     Find bones randomly looks for bones in the yard.
     */

    private static int findBones() {

        int numTrials = 0;

        do {
            findX = rand.nextInt(50) + 1;
            findY = rand.nextInt(50) + 1;
            numTrials++;
        } while (yard[findX][findY] == 0
                && yard[findX + 1][findY] == 0
                && yard[findX - 1][findY] == 0
                && yard[findX][findY + 1] == 0
                && yard[findX][findY - 1] == 0);
        System.out.printf("     (%2d,%2d" + ")", findX, findY);
        return numTrials;

    }
}
/*Welcome to digging up bones!
Please enter an integer to use as a seed for simulation: 1
             Digging Up Bones --- Brent
Trial       Bone    Coordinates    Bone Found    #Holes
 1         (16,11)(11,34)(48,23)     (16,11)        18 
 2         (32,10)(31, 7)(46,13)     (30, 7)       169 
 3         (27,39)( 6,51)(14,42)     (27,40)        72 
 4         (26,28)(34,26)(41,47)     (41,46)       221 
 5         (35,24)(22,11)(24,20)     (22,11)       283 
 6         (22, 4)(19,30)(21,21)     (21,21)       626 
 7         (13, 2)(26,31)(14,28)     (27,31)       146 
 8         (26,23)(14,32)(19,21)     (14,32)       157 
 9         ( 1,46)( 7,22)(27,26)     (27,27)       207 
10         (35,31)(13, 6)(14,46)     (13, 7)        78 
11         (48,47)(47,34)( 5, 1)     (46,34)        37 
12         (45,12)(33,37)( 9, 1)     (33,37)       242 
13         (40,45)(19,16)(27,10)     (40,44)       155 
14         (42,47)(21,31)(32,34)     (41,47)       114 
15         (26, 7)(24, 4)(17,20)     (18,20)       180 
Average number of holes dug to find a bone:  180.33 
Want to play again? (y/n) y
Please enter an integer to use as a seed for simulation: 99
             Digging Up Bones --- Brent
Trial       Bone    Coordinates    Bone Found    #Holes
 1         (41, 9)(22, 7)( 4,21)     (21, 7)        62 
 2         (35,40)(36,19)(32,32)     (35,41)        41 
 3         ( 6,49)(20,13)(36,29)     ( 6,48)       992 
 4         ( 6, 6)(35, 8)(16,19)     (15,19)        14 
 5         (32,51)( 4,30)(27,21)     (28,21)       340 
 6         (34,12)( 3,27)(33,30)     ( 2,27)       590 
 7         (13,21)(14,38)(44,26)     (13,38)       369 
 8         (46,32)(12,39)(43,17)     (46,31)       707 
 9         (20,22)( 2, 5)(42,19)     ( 1, 5)        63 
10         (28,23)(26,49)(18, 4)     (28,24)        10 
11         (32, 9)(18,40)(42,43)     (31, 9)        56 
12         (26,35)( 5,22)(36, 9)     ( 5,21)        11 
13         (25, 1)(27,27)( 9, 2)     ( 9, 1)        53 
14         ( 3, 3)(19,46)(40,42)     (41,42)         2 
15         (32,20)( 2, 5)(17, 5)     (16, 5)       135 
Average number of holes dug to find a bone:  229.67 
Want to play again? (y/n) y
Please enter an integer to use as a seed for simulation: 4
             Digging Up Bones --- Brent
Trial       Bone    Coordinates    Bone Found    #Holes
 1         ( 9,35)(34,50)(49,16)     ( 9,35)        72 
 2         (21,36)(17,22)(11,49)     (22,36)        32 
 3         ( 4,21)(38,15)(25,46)     (39,15)       105 
 4         (34,13)(33,49)(10,19)     ( 9,19)       190 
 5         ( 3,15)( 6,39)(20,31)     (20,32)       134 
 6         (43,30)(31,36)(11, 4)     (30,36)        88 
 7         (43,21)(24,48)(49,33)     (49,34)        41 
 8         (29,16)(12,41)( 8,21)     (12,42)        69 
 9         (47,23)(48,49)( 8,36)     (48,23)       641 
10         ( 4,18)(35,20)(38,11)     (35,20)        36 
11         (41,39)(19,13)(45,27)     (41,39)        47 
12         (37,14)(29,20)( 8, 8)     ( 9, 8)       249 
13         ( 2,30)(26, 7)(45, 7)     ( 1,30)       185 
14         (42,21)( 8,30)(14,14)     (14,15)       160 
15         ( 1,28)(42,46)(38,17)     (38,16)       107 
Average number of holes dug to find a bone:  143.73 
Want to play again? (y/n) n*/
