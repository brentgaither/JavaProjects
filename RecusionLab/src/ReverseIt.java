package recusionlab;
// CSC 161 Recursion Lab - ReverseIt.java
// You will finish writing two methods, one recursive  
// and one not, to reverse the characters in a string.
// Brent Gaither 

import java.util.Scanner;

class ReverseIt
{
	static public void main(String args[])
	{  
		char []charArray; 
		String sentence, 
		       newSentence,
				 doMore;
		
		Scanner keyboard = new Scanner(System.in);
	
	   System.out.println("Brent");
			   
	   do
		{	// Input a string and then store it as an array of characters.  
			System.out.println ("\nInput a sentence. ");
			sentence = keyboard.nextLine();
		   charArray = sentence.toCharArray();
			reverse(charArray,0,charArray.length);
		   // CALL THE reverse METHOD AND PASS IT THE CHAR ARRAY
			// AND THE POSITION OF ITS FIRST AND LAST CHARACTERS.
			
			// Copy the reversed array to another string and display it.
			newSentence = new String(charArray);
		   System.out.println("The sentence read backwards is: \n" + newSentence + '\n');
			
			// See if user wants to continue
			System.out.println("Do you want to reverse another sentence (y/n)? ");
			doMore = keyboard.nextLine();
			
		}while( doMore.charAt(0) == 'y' );
	}//End main
	
	/*****************************************************************
	                          reverse 
	This non-recursive method will reverse the characters in an array. 
	******************************************************************/
	static void reverse(char[] c, int first, int last)  
	{  char temp;
	   
	   while (first < last)    // Loop if we're not done yet
		{	
              temp= c [first];
               c [first] = c[last];
               c[last] = temp;
		   // WRITE THE 3 LINES OF CODE NEEDED TO SWAP THE 
			// CHARACTERS IN ARRAY POSITIONS first AND last.
			first= first+1;	
                        last= last-1;
		   // "MOVE" first AND last SO THEY WILL REFERENCE THE 
			// NEXT 2 CHARACTERS OF THE ARRAY TO BE SWAPPED. 
			
		}	
	}// End reverse 
		
	
	/*****************************************************************
	                       R_reverse 
	This recursive method will reverse the characters in an array. 
	******************************************************************/
	static void R_reverse(char[] c, int first, int last)  
	{  char temp;
	   
	  	// REPLACE THESE LINES WITH CODE THAT SIMPLY RETURNS
		// IF FIRST >= LAST (SINCE WE'RE DONE IN THAT CASE).
		// THIS IS WHAT WILL EVENTUALLY STOP THE RECURSION.
                if (first>=last)
                    return;
		// WRITE THE 3 LINES OF CODE NEEDED TO SWAP THE
		// CHARACTERS IN ARRAY POSITIONS first AND last.
                temp= c [0];
               c [0] = c[c.length];
               c[c.length] = temp;
		// YOU HAVE JUST SWAPPED THE LEFTMOST AND RIGHTMOST
		// PREVIOUSLY UNSWAPPED CHARACTERS IN c.
		// NOW RECURSIVELY CALL R_reverseIt TO SWAP THE 
		// CHARACTERS IN POSITIONS first+1 AND last-1.
 		R_reverse(c,first+1,last-1);	
	}// End R_reverse  
	
}//End ReverseIt class declaration   