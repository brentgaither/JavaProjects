package inheritance;
// Inheritance Lab Client Program 1
// Written by Prof. Walters and previous 161 classes

class Client1
{
	static int petNum = 0;
	
	public static void main(String[] args)
	{
		Pet pet1 = new Pet();
		pet1.setName("Mr. Limpet");
		pet1.setWeight(0);
		pet1.setHeight(1);
		pet1.setBirthYear(2005);
		displayInfo(pet1);
		
		                   // name       wt  ht   yr 
		Pet pet2 = new Pet("Shinypants", 10, 12, 2002);
		displayInfo(pet2);
	}
	
	private static void displayInfo(Pet thePet)
	{
		petNum++;
		System.out.println("Pet " + petNum + " is named " +
		                   thePet.getName() + ".");
		System.out.println(thePet.getName() + " is " +
		                   thePet.getAge(2012) + " year(s) old.\n");
	}
}