package stack;

import java.util.Scanner;

/**
 * Brent Gaither
 * Lab 8B reverse string
 */
public class ReverseString {
    Stack stack;
    
   public  ReverseString(){
       stack = new Stack();
       
   }
   
   public static void main (String[] args)
	{
            String input;
            
            Scanner keyboard = new Scanner(System.in);            
            System.out.println("Enter a word to be reversed or 0 to quit");
            
            input = keyboard.nextLine();
            while (!input.equals("0")) {
                System.out.println(reverseIt(input));
                input = keyboard.nextLine();            
            } 
            
        }
   /********************************************
                    reverseIt
    Reverses the string that was passed.
                   
   *********************************************/
   public static StringBuilder reverseIt(String word){
       
       Stack stack = new Stack();
       StringBuilder reverse = new StringBuilder();
       char ch;
       int intChar;
       //Pushes each char onto the stack.
       for (int i = 0; i < word.length(); i++)
       {     
          intChar = (int)word.charAt(i);
          stack.push(intChar);
       }
       //Pops each char off the stack.
       while (!stack.isEmpty())
       {
         intChar = (int)(stack.pop());
         reverse.append((char)intChar);
       }
       return reverse;
   
   }
}
