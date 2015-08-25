package inheritance;
// Inheritance Lab Client Program 2
// Written by Prof. Walters and previous 161 classes

class Client2
{
	static int dogNum = 0;

	public static void main(String[] args)
	{
		                   // name   wt  ht   yr   tag   		
		Dog dog1 = new Dog("Chief",  42, 30, 2000, 982);
		displayInfo(dog1);
		
		Pet dog2 = new Dog("Buhbuh", 50, 28, 1996, 674);
		displayInfo(dog2);
	}
	private static void displayInfo(Pet theDog)
	{
		dogNum++;
		System.out.println("Dog " + dogNum + " is named " +
		                   theDog.getName() + ".");
		System.out.println(theDog.getName() + " is " +
		                   theDog.getAge(2012) + " years old.");
		System.out.println(theDog.getName() + " has a tag number of " +
		                   theDog.getRabiesTag() + ".");
		System.out.println(theDog.getName() + " greets others by saying \"" +
		                   theDog.getGreeting() + ".\"\n");
	}
}