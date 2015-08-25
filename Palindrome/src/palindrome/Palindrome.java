package palindrome;
// CSC 161 Recursion Lab - Palindrome.java
// Brent Gaither

import java.util.Scanner;

class Palindrome {

    static public void main(String args[]) {
        String sentence,
                doMore;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Brent");
        do {
            // Get a string to be tested
            System.out.println("\nInput a sentence. ");
            sentence = keyboard.nextLine();

            if (R_isPalindrome(sentence, 0, (sentence.length() - 1))) {
                System.out.println("Your sentence is a palindrome.\n");
            } // CALL THE isPalindrome METHOD AND PASS IT 3 ARGUEMENTS: 
            // sentence, AND THE POSITION OF ITS FIRST AND LAST CHARACTERS.)
            else {
                System.out.println("Your sentence is NOT a palindrome.\n");
            }

            // See if user wants to continue
            System.out.println("Do you want to test another sentence (y/n)? ");
            doMore = keyboard.nextLine();
        } while (doMore.charAt(0) == 'y');

    }//End main

    /**
     * ************************************************
     * isPalindrome This non-recursive method will determine whether or not the
     * string passed to it is a palindrome.
	***************************************************
     */
    static boolean isPalindrome(String s, int first, int last) {
        while (first < last) {
            if (s.charAt(first) != s.charAt(last)) {//A difference 
                                                    //has been found
                return false;
            }
            first++;
            last--;
// WRITE STATEMENTS TO "MOVE" FIRST AND LAST  
            // TO THE NEXT 2 CHARACTERS TO BE COMPARED.
        }
        // If we got this far without returning, no differences were found.
        return true;

    }// End isPalindrome 

    /**
     * ************************************************
     * R_isPalindrome This recursive method will determine whether or not the
     * string passed to it is a palindrome.
	***************************************************
     */
    static boolean R_isPalindrome(String s, int first, int last) {

        if (first > last) {
            return true;
        } else if (s.charAt(first) != s.charAt(last)) {
            return false;
        } else {
            return R_isPalindrome(s, first + 1, last - 1);
        }
    }// End R_isPalindrome

}//End Palindrome class declaration 
/*
run:
Brent

Input a sentence. 
12321
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
33 44 33
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
A
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
able was i ere i saw elba
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
big fish
Your sentence is NOT a palindrome.

Do you want to test another sentence (y/n)? 
n
BUILD SUCCESSFUL (total time: 39 seconds)

RECURSION FUNCTION

run:
Brent

Input a sentence. 
12321
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
33 44 33
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
A
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
mom
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
able was i ere i saw elba
Your sentence is a palindrome.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
big fish
Your sentence is NOT a palindrome.

Do you want to test another sentence (y/n)? 
n
BUILD SUCCESSFUL (total time: 29 seconds)

*/
