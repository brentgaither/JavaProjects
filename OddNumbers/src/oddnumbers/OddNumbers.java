package oddnumbers;

// CSC 161 Recursion Lab - OddNumbers.java
// This will check for odd numbers
// method with a recursive version.
// Brent Gaither
import java.util.Scanner;

class OddNumbers {

    static public void main(String args[]) {
        int[] numbers = new int[6];
        int position = 5;
        String doMore;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Brent");
        do {
            // Get an array to be tested
            System.out.println("\n Input numbers to check for odd numbers ");
            for (int i = 0; i < position; i++) {
                numbers[i] = keyboard.nextInt();
            }
            System.out.println(" ");
            if (R_anyOdd(position, numbers)) {//Call any odd function pass it postion and number array
                System.out.println("Your set contains an odd number \n");
            }
            else
		System.out.println("Your set does not contains an odd number\n");

            // See if user wants to continue
            System.out.println("Do you want to try another set of numbers (y/n)? ");
            keyboard.nextLine();
            doMore = keyboard.nextLine();
        } while (doMore.charAt(0) == 'y');

    }//End main

    static boolean R_anyOdd(int position, int[] numbers) {

        if (position <0) {
            return false;
        }
        if (numbers[position] % 2 == 1) {
            return true;
        }
        return R_anyOdd(position - 1, numbers);

    }//End CountDimonds class declaration
}
/*
 Brent

 Input numbers to check for odd numbers 
1
2
3
4
5
 
Your set contains an odd number 

Do you want to try another set of numbers (y/n)? 
y

 Input numbers to check for odd numbers 
4
4
4
4
5
 
Your set contains an odd number 

Do you want to try another set of numbers (y/n)? 
y

 Input numbers to check for odd numbers 
2
1
2
2
2
 
Your set contains an odd number 

Do you want to try another set of numbers (y/n)? 
y

 Input numbers to check for odd numbers 
24
4
10
8
16
 
Your set does not contains an odd number

Do you want to try another set of numbers (y/n)? 
y
 Input numbers to check for odd numbers 
1
2
2
2
2
 
Your set contains an odd number 

Do you want to try another set of numbers (y/n)? 
n*/
