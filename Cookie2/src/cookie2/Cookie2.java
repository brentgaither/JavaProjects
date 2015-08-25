/**
 * *************************************************
 * Brent Gaither Program 1 Cookie version 2 April 29th 2014 This program
 * simulates a bone being found in a yard.
 * /*****************************************************
 * *********************************************************** CSC 161 Java
 * Program 1 - Version 2 - User Program * Used to test student programs. Written
 * by Prof. Walters * edited by Brent Gaither * This client program allows the
 * user to play the * Cookie game by creating BoneGame class objects. *
 * ***********************************************************
 */
package cookie2;

import java.util.Scanner;

public class Cookie2 {

    /**
     * **********************************************
     * main Main creates and uses BoneGame.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int yardSize,
                numTrials,
                numBones,
                seed;

            System.out.println("\n\nGame 1: Seed = 71"); // Uses invalid args
            BoneGame cookie1 = new BoneGame(2, 0, 8); // Default vals(50,15,3) 
            cookie1.play(71);                     // should be used

            System.out.println("\n\nGame 2: Seed = 5"); // Uses the 
            //1 arg constructor
            BoneGame cookie2 = new BoneGame(30);
            cookie2.play(5);

            System.out.println("\n\nGame 3: Seed = 19"); // Uses the 
            //3 arg constructor
            BoneGame cookie3 = new BoneGame(50, 20, 5);
            cookie3.play(19);

            System.out.println("\n\nGame 4: ");

            System.out.print("Enter the yard size: ");
            yardSize = keyboard.nextInt();
            
            System.out.print("Enter number of trials: ");
            numTrials = keyboard.nextInt();
            
            System.out.print("Enter number of bones: ");
            numBones = keyboard.nextInt();
            
            System.out.print("Enter seed for simulation: ");
            seed = keyboard.nextInt();
            
            BoneGame cookie4 = new BoneGame(yardSize, numTrials, numBones);
            cookie4.play(seed);

            System.out.println("\n\nGame 5: ");
            
            System.out.print("Enter the yard size: ");
            yardSize = keyboard.nextInt();
            
            System.out.print("Enter seed for simulation: ");
            seed = keyboard.nextInt();
            
            BoneGame cookie5 = new BoneGame(yardSize);
            cookie5.play(seed);
            
            System.out.println("\n\nGame 6: ");
            System.out.print("Enter seed for simulation: ");
            seed = keyboard.nextInt();
            BoneGame cookie6 = new BoneGame();
            cookie6.play(seed);


    }//End main
}//End Cookie2 class
/*


Game 1: Seed = 71
Invalid size yard size will be set to 50
Invalid number of trials. Trials will be set to 15.
Invalid number of bones. 3 bones will be used.


             Digging Up Bones --- Brent 

Trial       Bone           Coordinates           Bone Found     #Holes
 1           (22,29)  (49,31)  (29,46)            (29,46)        124 
 2           (41,25)  ( 1,27)  (48,50)            (41,25)         29 
 3           (39,23)  (17, 4)  (18,26)            (17, 4)        346 
 4           (10,48)  (26,46)  ( 6, 2)            ( 6, 2)        540 
 5           (27,44)  (41,20)  (37,41)            (41,20)        145 
 6           (19,45)  ( 5,30)  (49,13)            (49,13)        103 
 7           (25, 1)  (43,39)  (50,13)            (50,13)          9 
 8           (36,44)  (40,21)  (44,30)            (36,44)         40 
 9           (32,23)  (46,18)  ( 2,11)            ( 2,11)        509 
10           (38,14)  (27, 4)  (26,15)            (38,14)         82 
11           ( 5, 7)  (31,42)  (21,45)            (31,42)          2 
12           ( 9,19)  (33, 9)  ( 4,17)            ( 9,19)         74 
13           (34,41)  (19,37)  (18, 1)            (19,37)        140 
14           (34,15)  (42,23)  (30,50)            (42,23)         11 
15           (28,27)  (50,26)  (28,13)            (28,13)        192 

 Average number of holes dug to find a bone:  156.40 


Game 2: Seed = 5


             Digging Up Bones --- Brent 

Trial       Bone           Coordinates           Bone Found     #Holes
 1           (18,23)  (15,15)  ( 7, 6)            ( 7, 6)         66 
 2           (16,15)  ( 5,30)  ( 4,26)            ( 5,30)          3 
 3           (28,12)  (23, 2)  (10,26)            (10,26)          4 
 4           ( 7,16)  ( 9,22)  (14,20)            ( 7,16)         13 
 5           ( 2,18)  ( 5,29)  (12,22)            ( 5,29)         10 
 6           (19,21)  (23, 4)  (18,14)            (19,21)          1 
 7           (21,25)  (18,12)  (11,18)            (11,18)        164 
 8           (13, 9)  ( 4,27)  (30, 3)            (13, 9)         21 
 9           (14, 8)  (27,22)  ( 7,27)            ( 7,27)        101 
10           ( 1,10)  (14,23)  (25,22)            (25,22)        138 
11           ( 6,26)  ( 4,25)  (29,13)            (29,13)         65 
12           (13,19)  (23,19)  (10,13)            (23,19)         87 
13           (22, 4)  (12, 2)  ( 8,13)            (22, 4)         48 
14           (12,28)  (21,25)  (19,10)            (12,28)         24 
15           (15,28)  (16,24)  (18,18)            (15,28)         82 

 Average number of holes dug to find a bone:  55.13 


Game 3: Seed = 19


             Digging Up Bones --- Brent 

Trial       Bone           Coordinates           Bone Found     #Holes
 1   (26,45)  ( 7,35)  (15,42)  (21,24)  (41,23)    (21,24)        154 
 2   ( 1,29)  (31,20)  ( 3,16)  (40, 9)  (39,44)    (31,20)        154 
 3   (36,14)  (31,50)  (42,32)  (10,41)  ( 2,16)    ( 2,16)        304 
 4   (35,42)  (45,42)  (21,27)  (20,47)  (27,13)    (21,27)         42 
 5   (38, 7)  (14, 7)  (24,16)  (48,45)  ( 6, 2)    (14, 7)          8 
 6   (13,23)  (12,50)  (11,33)  (34,43)  (35, 5)    (13,23)         50 
 7   (40,30)  (41,13)  (17,37)  (20,45)  (48,25)    (48,25)          2 
 8   (37,36)  (13,21)  (22,48)  ( 3,10)  (21, 6)    ( 3,10)         21 
 9   ( 7, 4)  (41,27)  (42,46)  (27,44)  (11,35)    ( 7, 4)        136 
10   (11,26)  (11,46)  (34,14)  (22,45)  (14,44)    (14,44)        369 
11   ( 2,16)  (48,41)  (10,27)  (35, 6)  (35,11)    ( 2,16)         27 
12   (12, 1)  (10,23)  ( 4,35)  (32,17)  (44,35)    (12, 1)        244 
13   (21,36)  (15,23)  ( 9,44)  ( 2,40)  (25,28)    ( 2,40)         89 
14   (39, 2)  (26, 2)  (40,39)  (18, 5)  (28,26)    (39, 2)         52 
15   (28,35)  (50,41)  (35,49)  (48,35)  (27,24)    (27,24)          1 
16   (16,50)  (12,25)  (43,27)  (19,18)  (10,24)    (19,18)         18 
17   (47,26)  ( 2, 3)  (35,46)  (49, 5)  (25,31)    (49, 5)         25 
18   (44,12)  (39,48)  (49, 9)  (31,16)  (34,33)    (31,16)         36 
19   (25,39)  (29,41)  (50,29)  (43, 7)  (16, 6)    (16, 6)          5 
20   (44,32)  (22,47)  (42,47)  ( 3,31)  (40, 1)    ( 3,31)         46 

 Average number of holes dug to find a bone:  89.15 


Game 4: 
Enter the yard size: 45
Enter number of trials: 20
Enter number of bones: 1
Enter seed for simulation: 19


             Digging Up Bones --- Brent 

Trial       Bone           Coordinates           Bone Found     #Holes
 1                    ( 6,30)                     ( 6,30)        407 
 2                    (20,31)                     (20,31)        154 
 3                    ( 6,15)                     ( 6,15)        380 
 4                    (32,32)                     (32,32)         20 
 5                    ( 5,38)                     ( 5,38)        110 
 6                    (17,31)                     (17,31)        189 
 7                    (15,28)                     (15,28)        136 
 8                    (23,24)                     (23,24)        863 
 9                    (34,28)                     (34,28)        342 
10                    (33,32)                     (33,32)        674 
11                    (10,19)                     (10,19)        909 
12                    (14,38)                     (14,38)        888 
13                    (41,13)                     (41,13)        154 
14                    (23,11)                     (23,11)        481 
15                    (26,32)                     (26,32)        244 
16                    ( 1, 2)                     ( 1, 2)        813 
17                    (39, 1)                     (39, 1)         62 
18                    ( 6,36)                     ( 6,36)        514 
19                    ( 1,22)                     ( 1,22)        833 
20                    ( 8,39)                     ( 8,39)        160 

 Average number of holes dug to find a bone:  416.65 


Game 5: 
Enter the yard size: 10
Enter seed for simulation: 5


             Digging Up Bones --- Brent 

Trial       Bone           Coordinates           Bone Found     #Holes
 1           ( 8, 3)  ( 5, 5)  ( 7, 6)            ( 7, 6)         23 
 2           ( 3, 8)  ( 4, 3)  (10, 1)            (10, 1)          2 
 3           ( 8, 7)  ( 9, 6)  ( 4, 8)            ( 8, 7)         10 
 4           ( 2, 8)  ( 4, 2)  ( 1, 2)            ( 4, 2)          7 
 5           ( 5,10)  ( 7, 6)  ( 4, 9)            ( 7, 6)         12 
 6           ( 6, 5)  ( 5,10)  ( 4, 6)            ( 5,10)          3 
 7           ( 8, 2)  ( 3, 2)  (10, 6)            (10, 6)          4 
 8           ( 7, 6)  ( 9, 2)  ( 4,10)            ( 7, 6)          8 
 9           ( 6, 9)  ( 2, 9)  ( 4, 9)            ( 2, 9)          3 
10           ( 5, 9)  ( 2, 2)  ( 7, 1)            ( 5, 9)          6 
11           ( 4, 3)  ( 1, 6)  ( 5, 9)            ( 1, 6)          5 
12           ( 8, 2)  ( 1, 8)  ( 3, 8)            ( 8, 2)          1 
13           (10, 1)  ( 4, 5)  ( 4, 7)            ( 4, 7)          1 
14           (10, 9)  ( 6, 8)  ( 3, 3)            ( 6, 8)         17 
15           ( 6, 4)  ( 9, 6)  ( 7, 6)            ( 7, 6)          2 

 Average number of holes dug to find a bone:  6.93 


Game 6: 
Enter seed for simulation: 5


             Digging Up Bones --- Brent 

Trial       Bone           Coordinates           Bone Found     #Holes
 1           (38,43)  (25,25)  ( 7, 6)            ( 7, 6)        249 
 2           (44, 5)  ( 9,49)  (31,47)            (44, 5)        143 
 3           (19,31)  (27,22)  (37,10)            (19,31)        167 
 4           (13, 5)  (17,45)  (37, 1)            (37, 1)        184 
 5           (17,28)  (29,16)  (32,50)            (32,50)         56 
 6           (26, 1)  (24,40)  ( 7,31)            (24,40)         61 
 7           (25,43)  (25, 2)  (28,19)            (28,19)         26 
 8           ( 2, 2)  (13,22)  (35, 2)            (13,22)         13 
 9           (37,21)  (32,22)  (39,16)            (32,22)         73 
10           (21,42)  (31,42)  (10,36)            (10,36)         34 
11           (45,15)  (12,37)  (24, 2)            (45,15)         42 
12           (20,26)  (29,15)  (12, 2)            (29,15)         67 
13           ( 8,43)  (40, 5)  ( 5,19)            ( 5,19)        190 
14           (49,35)  (16,11)  ( 7, 9)            (49,35)        292 
15           (40,21)  (15,20)  (20,35)            (15,20)        113 

 Average number of holes dug to find a bone:  114.00  */