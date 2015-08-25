package richcount;
// CSC 161 Recursion Lab - RichCount.java
// You will replace the non-recursive countVowels 
// method with a recursive version.

// Brent Gaither
import java.util.Scanner;

class RichCount {

    static int totalDimonds = 0;

    static public void main(String args[]) {
        int year;
        String doMore;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Brent");
        do {
            // Get a string to be tested
            System.out.println("\nInput anniversary year. ");
            year = keyboard.nextInt();

            System.out.println("\n After " + year + " years she will recieve "
                    + R_countDimonds(year)
                    + " dimonds.\n");

            // See if user wants to continue
            System.out.println("Do you want to try another year (y/n)? ");
            keyboard.nextLine();
            doMore = keyboard.nextLine();
        } while (doMore.charAt(0) == 'y');

    }//End main

    static int R_countDimonds(int year) {

        if (year == 0) {
            return 0;
        }
        return R_countDimonds(year - 1) + year;

    }//End CountDimonds class declaration
}
/*
Brent

Input anniversary year. 
10

 After 10 years she will recieve 55 dimonds.

Do you want to try another year (y/n)? 
y

Input anniversary year. 
25

 After 25 years she will recieve 325 dimonds.

Do you want to try another year (y/n)? 
y

Input anniversary year. 
50

 After 50 years she will recieve 1275 dimonds.

Do you want to try another year (y/n)? 
n
*/
