package recusionlab;
// CSC 161 Recursion Lab - CountVowels.java
// You will replace the non-recursive countVowels 
// method with a recursive version.

// Brent Gaither

import java.util.Scanner;

class CountVowels
{
	static public void main(String args[])
	{  
		String sentence,
		       doMore;
		Scanner keyboard = new Scanner(System.in);
	
	   System.out.println("Brent"); 
  		do
		{
		   // Get a string to be tested
			System.out.println ("\nInput a sentence. ");
			sentence = keyboard.nextLine();
		   		
		 	System.out.println("\nYour sentence contains "
			               	+ countVowels(sentence, sentence.length()-1) 
		           	      	+ " vowels.\n");
			
			// See if user wants to continue
			System.out.println("Do you want to test another sentence (y/n)? ");
			doMore = keyboard.nextLine();
		}while( doMore.charAt(0) == 'y' );
			
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
	      {  case 'a': case 'A':
	         case 'e': case 'E':
	         case 'i': case 'I':
	         case 'o': case 'O':
	         case 'u': case 'U': totalVowels++;
				default:            /* Do nothing */;
         }
		}
		return totalVowels;
	}//End countVowels
        static int R_countVowels(String s, int lastPos) {
             int totalVowels = 0;
		
		for (int checkPos = 0; checkPos <= lastPos; checkPos++)
		{  switch (s.charAt(checkPos))
	      {  case 'a': case 'A':
	         case 'e': case 'E':
	         case 'i': case 'I':
	         case 'o': case 'O':
	         case 'u': case 'U':
                 return totalVowels+1;           /* Do nothing */
         }
		}
		return totalVowels;
        }
	
}//End CountVowels class declaration
