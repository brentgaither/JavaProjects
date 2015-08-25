package inheritance;
// Pet class declaration
// Written by Prof. Walters and previous 161 classes

class Pet
{
	protected String name;
	protected int weight,
	            height,
	            birthYear;

	// Constructors
	public Pet()           
	{
		name = "unnamed";
		weight = 0;
		height = 0;
		birthYear = 0;
	}
	
	public Pet(String passedName, int passedWeight, 
	           int passedHeight, int passedBirthYear)
	{
		name = passedName;
		weight = passedWeight;
		height = passedHeight;
		birthYear = passedBirthYear;
	}
	
	// Mutators ("set" functions)
	public void setName(String passedName)
	{	name = passedName;
	}
	
	public void setWeight(int passedWeight)
	{	weight = passedWeight;
	}
	
	public void setHeight(int passedHeight)
	{	height = passedHeight;
	}
	
	public void setBirthYear(int passedBirthYear)
	{	birthYear = passedBirthYear;
	}
	
	// Accessors ("get" functions)
	public String getName()
	{	return name;
	}
	
	public int getWeight()
	{	return weight;
	}
	
	public int getHeight()
	{	return height;
	}
	
	public int getBirthYear()
	{   return birthYear;
	}
	
	public int getAge(int currentYear)
	{	return (currentYear - birthYear);
	}
	
	// Methods that will be overridden in derived classes
	public int getRabiesTag()
	{	return 0;
	}
	
	public String getGreeting() 
	{	return "unknown";
	}
	
	public String getColor()
	{	return "unknown";
	}
}