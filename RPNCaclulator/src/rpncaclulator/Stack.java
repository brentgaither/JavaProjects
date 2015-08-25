package rpncaclulator;
// This class implements a Stack, using the 
// functions of a LList object that it "owns".
// Competed by <Brent Gaither and Travis Morrison.>

public class Stack 
{
	private LList stack;	
		
        public Stack ()
        {
            stack = new LList();
        }
	// Public methods
	
  /**************************************************
	                    isEmpty
	 Is the stack empty? Returns true or false.
   **************************************************/
	public boolean isEmpty()
	{
		if(stack.isEmpty())
                    return true;
                else
                    return false;
	}

  /**************************************************
	                    size
	Returns the number of values in the stack.
   **************************************************/
	public int size()
	{
           return stack.size();
            
	}

  /**************************************************
	                      push
	 Adds a node containing val to the top of the stack.
   **************************************************/
	public void push(double val)
	{
             stack.addToFront(val);           
	}
	
  /**************************************************
                         pop
   Removes the node at the top of the stack and
   returns the value stored in it. 
   **************************************************/
   public double pop()
   {
	return stack.removeFront();
   }
	
  /**************************************************
	                      peek
   Returns the value stored at the top of the stack,
   but does not remove it from the stack. 	
   **************************************************/
	public double peek()
	{
		return stack.peek();			
	}
	
  /**************************************************
                      emptyOut
   Removes any nodes in the stack, leaving the
   stack empty.
   **************************************************/
   public void emptyOut()
	{
		stack.destroyList();
	}
   
}// End stack class