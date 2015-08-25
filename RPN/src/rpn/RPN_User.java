package rpn;
// RPN_User
// This client Program uses an RPN object to evaluate RPN expressions. 
// It gets the expressions to evaluate from an array of strings, and 
// expects the RPN evaulate method to return the answer as a double.  
import java.util.Scanner;

class RPN_User
{
	public static void main(String [] args)
	{  
	 	Scanner keyboard = new Scanner(System.in); 
		 
		String [] expression = 
		      {"3  3 +","6 8 +",
				 "3 3 4 + *","5 5 * 2 / 1 +",
				 "7 2 - 3 5 * - ", "1 2 3 4 5 + + + + 6 -",
				 "3 2 + * 5","7 - 2 3 +",
				 "6 7 8 9 * +", "25 2 / 19 + 30 -",  
				 "2.5 2.5 + 10.00 /" };
										        								  
	  	RPN rpnHelper = new RPN(expression);

      for (int i = 0; i < expression.length; i++)
		{  			
         System.out.println(expression[i] + " = " + 
			                  rpnHelper.Evaluate(expression[i]) );
		}	
	}//End main
	
} // End RPN_User_A class