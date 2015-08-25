// TESTING LAB
// This program is supposed to average 2 test scores for
// each student in a class, but it contains logic errors.

import java.util.Scanner; 
public class Testing
{
	public static void main(String[] args)
	{
		String name;               // Student first name
	       
		int count = 1,             // Student counter                 
		    score;                 // An individual score read in
		            // Total of a student's 2 scores
		double average;            // Average of a student's 2 scores
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the first name of student " + count +
		                 " (or Q to quit): ");
		name = keyboard.nextLine();       
	
		while ( !(name.equals("Q") || name.equals("q")) )
		{	
                    int totalScore = 0;
	  	 	// Get and validate the first score
	  		System.out.print("Enter score 1: ");
	   	score = keyboard.nextInt();
			
	   	while (score < 0 || score > 100)
	   	{  System.out.print("Score must be between 0 and 100. Please reenter: ");
	      	score = keyboard.nextInt();
	   	}
	   	totalScore += score;      // Add the first score onto the total

	   	// Get and validate the second score
	   	System.out.print("Enter score 2: ");
	   	score = keyboard.nextInt();
			
	   	while (score < 0 || score > 100)
	   	{  System.out.print("Score must be between 0 and 100. Please reenter: ");
	      	score = keyboard.nextInt();
	   	}
	   	totalScore += score;     // Add the second score onto the total

	   	// Calculate and print average
	   	average = totalScore / 2;
	   	System.out.println(name + "  " + average);
                
                count++; //counts before it says name
	   	// Get the next student name
			System.out.print("\nEnter the first name of student " + count +
	        		           " (or Q to quit): ");
			keyboard.nextLine();        // Flush the last \n from the buffer					  
	   	name = keyboard.nextLine();
		}
	}//End main method
	
}// End Testing class declaration