package stack;

// UseStack_N_Q.java
// This "client" class was created to test the functions
// in the Stack and Queue classes.
// Completed by Brent Gaither Travis Morrison>
class UseStack_N_Q
{
	public static void main (String[] args)
	{
            Stack myStack = new Stack();

            Queue myQ = new Queue();
            
            System.out.println("Brent Gaither");

		// TESTING THE Q	
		System.out.println("Q size initially = " + myQ.size());
		if (myQ.isEmpty())
		   System.out.println("The Q is empty.");

		System.out.println("\nAdding 1, 2, 3, 4, 5 to the Q.");
		
		for (int i = 1; i <= 5; i++)
			myQ.enqueue(i);
			
		System.out.println("The front of the Q holds a " + myQ.peek());

		System.out.println("\nRemoving and printing all Q values:");
		while (!myQ.isEmpty())
			System.out.print(myQ.dequeue() + "    ");
			
		System.out.println("\n\nNow try to remove item from empty Q.");		
		myQ.dequeue();
		
			
		// TESTING THE STACK		
		System.out.println("\nAdding 1, 2, 3, 4, 5 to the stack.");
		for (int i = 1; i <= 5; i++)
			myStack.push(i);
			
		System.out.println("The top of the stack holds a " +
		                    myStack.peek());
								  
		System.out.println("\nPopping and printing all stack values:");
		while (!myStack.isEmpty())
			System.out.print(myStack.pop() + "    ");
			
		System.out.println("\n\nNow try to remove item from empty stack.");;
		myStack.pop();
		
	}//End main
}//End UseStack_N_Q class declaration