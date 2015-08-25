// Brent Gaither
package countvowels;

import java.util.Scanner;

class CountVowels {

    static public void main(String args[]) {
        String sentence,
                doMore;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Brent");
        do {
            // Get a string to be tested
            System.out.println("\nInput a sentence. ");
            sentence = keyboard.nextLine();

            System.out.println("\nYour sentence contains "
                    + R_countVowels(sentence, 0, sentence.length() - 1)
                    + " vowels.\n");

            // See if user wants to continue
            System.out.println("Do you want to test another sentence (y/n)? ");
            doMore = keyboard.nextLine();
        } while (doMore.charAt(0) == 'y');

    }//End main

	/**************************************************
	                    countVowels 
	This method counts and returns 
	the number of vowels in a string. 
	****************************************************/
 	static int countVowels(String s, int lastPos) 
	{  
	   int totalVowels = 0;
		
		for (int checkPos = 0; checkPos <= lastPos; checkPos++)
		{  switch (s.charAt(checkPos))
	       { case 'a': case 'A':
	         case 'e': case 'E':
	         case 'i': case 'I':
	         case 'o': case 'O':
	         case 'u': case 'U': totalVowels++;
			  default:           /* Do nothing */;
          }
		}
		return totalVowels;
	}//End countVowels
	static int R_countVowels(String s,int firstPos, int lastPos){
            int totalVowels=0;
              if(lastPos<0)
                  return 0;
		
		
		{  switch (s.charAt(firstPos))
	       { case 'a': case 'A':
	         case 'e': case 'E':
	         case 'i': case 'I':
	         case 'o': case 'O':
	         case 'u': case 'U': totalVowels++;
			  default:           /* Do nothing */;
          }
		}
		return R_countVowels(s,firstPos+1,lastPos-1) + totalVowels;
        }
        
}//End CountVowels class declaration
/*
Brent

Input a sentence. 
The fat little DOG sat by the BROOK.

Your sentence contains 9 vowels.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
We are just counting AEIOU, not y.

Your sentence contains 13 vowels.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
Ths hs jst cnsnts.

Your sentence contains 0 vowels.

Do you want to test another sentence (y/n)? 
n
BUILD SUCCESSFUL (total time: 50 seconds)


Brent

Input a sentence. 
The fat little DOG sat by the BROOK.

Your sentence contains 9 vowels.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
We are just counting AEIOU, not y.

Your sentence contains 13 vowels.

Do you want to test another sentence (y/n)? 
y

Input a sentence. 
Ths hs jst cnsts.

Your sentence contains 0 vowels.

Do you want to test another sentence (y/n)? 
n*/