package towerofhanoi;

/******************************************************************
                    HanoiDemo.java
	This "client" class demonstrates the Hanoi class, which displays 
	the steps necessary to solve the Towers of Hanoi problem.
	Run it for 1, 2, 3, and 4 disks, noting the results each time.
*******************************************************************/
import java.util.Scanner;

public class HanoiDemo
{
   static public void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
		
		System.out.print("This program showns the steps to solve the " +
		                 "Towers of Hanoi problem. \n" + 
		                 "Please enter the number of disks to be moved: ");
		int numDisks = input.nextInt();
		
		TowerOfHanoi towersOfHanoi = new TowerOfHanoi(numDisks);
                
   }
}