package inheritance;
// Inheritance Lab Client Program 3
// Written by Prof. Walters and previous 161 classes

class Client3
{
	static int birdNum = 0;

	public static void main(String[] args)
	{
		                   // name          wt  ht   yr    color
		Bird bird1 = new Bird("Paulie",     1,  5,  1988, "orange");
		displayInfo(bird1);
		
		Bird bird2 = new Bird("Toucan Sam", 6, 18,  1992, "blue");
		displayInfo(bird2);
	}
	
	private static void displayInfo(Bird theBird)
	{
		birdNum++;
		System.out.println("Bird " + birdNum + " is named " +
		                   theBird.getName() + ".");
		System.out.println(theBird.getName() + " is " +
		                   theBird.getAge(2012) + " months old.");
		System.out.println(theBird.getName() + " is colored " +
		                   theBird.getColor() + ".");
		System.out.println(theBird.getName() + " greets others by saying \"" +
		                   theBird.getGreeting() + ".\"\n");
	}
}