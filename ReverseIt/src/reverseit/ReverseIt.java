package reverseit;
// CSC 161 Recursion Lab - ReverseIt.java
// You will finish writing two methods, one recursive  
// and one not, to reverse the characters in a string.
// Brent Gaither 

import java.util.Scanner;

class ReverseIt {

    static public void main(String args[]) {
        char[] charArray;
        String sentence,
                newSentence,
                doMore;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Brent");

        do {// Input a string and then store it as an array of characters.  
            System.out.println("\nInput a sentence. ");
            sentence = keyboard.nextLine();
            charArray = sentence.toCharArray();
            R_reverse(charArray, 0, charArray.length - 1);
		   // CALL THE reverse METHOD AND PASS IT THE CHAR ARRAY
            // AND THE POSITION OF ITS FIRST AND LAST CHARACTERS.

            // Copy the reversed array to another string and display it.
            newSentence = new String(charArray);
            System.out.println("The sentence read backwards is: \n"
                    + newSentence + '\n');

            // See if user wants to continue
            System.out.println("Do you want to reverse "
                    + "another sentence (y/n)? ");
            doMore = keyboard.nextLine();

        } while (doMore.charAt(0) == 'y');
    }//End main

    /**
     * ***************************************************************
     * reverse This non-recursive method will reverse the characters in an
     * array. 
	*****************************************************************
     */
    static void reverse(char[] c, int first, int last) {
        char temp;

        while (first < last) // Loop if we're not done yet
        {
            temp = c[first];
            c[first] = c[last];
            c[last] = temp;

            first = first + 1;
            last = last - 1;
        }
    }// End reverse 

    /**
     * ***************************************************************
     * R_reverse This recursive method will reverse the characters in an array. 
	*****************************************************************
     */
    static void R_reverse(char[] c, int first, int last) {
        char temp;

        if (first >= last) {
            return;
        }

        temp = c[first];
        c[first] = c[last];
        c[last] = temp;
        R_reverse(c, first + 1, last - 1);
    }// End R_reverse  

}//End ReverseIt class declaration   
/*
run:
Brent

Input a sentence. 
12345
The sentence read backwards is: 
54321

Do you want to reverse another sentence (y/n)? 
y

Input a sentence. 
NOITCNUF EVISRUCER A ETORW I
The sentence read backwards is: 
I WROTE A RECURSIVE FUNCTION

Do you want to reverse another sentence (y/n)? 
y

Input a sentence. 
SNAP & STOP
The sentence read backwards is: 
POTS & PANS

Do you want to reverse another sentence (y/n)? 
n
BUILD SUCCESSFUL (total time: 51 seconds)

RECURSIVE FUNCTION
run:
Brent

Input a sentence. 
12345
The sentence read backwards is: 
54321

Do you want to reverse another sentence (y/n)? 
y

Input a sentence. 
NOITCNUF EVISRUCER A ETORW I
The sentence read backwards is: 
I WROTE A RECURSIVE FUNCTION

Do you want to reverse another sentence (y/n)? 
y

Input a sentence. 
SNAP & STOP
The sentence read backwards is: 
POTS & PANS

Do you want to reverse another sentence (y/n)? 
n
BUILD SUCCESSFUL (total time: 21 seconds)
*/
