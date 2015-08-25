package stack;
// This class implements a Queue, using the 
// functions of a LList object that it "owns".
// Competed by <Brent Gaither>
 
public class Queue 
{
   private LList queue;
			
   public Queue (){
    queue = new LList();
}
           
    

           
	// Public methods
	
  /**************************************************
	                    isEmpty
	Is the Q empty? Returns true or false.
   **************************************************/
	public boolean isEmpty()
	{
            return queue.isEmpty();
	}

  /**************************************************
	                     size
	Returns the number of values in the Q.
   **************************************************/
	public int size()
	{
	 return queue.size();
	}

  /**************************************************
	                      enQueue
   Adds a node containing val to the end of the Q. 
   **************************************************/
	public void enqueue(double val)
	{
            queue.addToRear(val);
	}

  /**************************************************
	                      deQueue
   Removes the node at the head of the Q and 
   returns the value stored in it. 
   **************************************************/
	public double dequeue()
	{
	 return queue.removeFront();
	}
	
  /**************************************************
	                      peek
   Returns the value stored at the front of the Q,
   but does not remove it from the Q. 	
   **************************************************/
	public double peek()
	{
		return queue.peek();
	}

  /**************************************************
                      emptyOut
   Removes any nodes in the Q, leaving the Q empty.
   **************************************************/
   public void emptyOut()
	{
		queue.destroyList();
	}
   
}// End Queue class

/*
Brent Gaither
Q size initially = 0
The Q is empty.

Adding 1, 2, 3, 4, 5 to the Q.
The front of the Q holds a 1.0

Removing and printing all Q values:
1.0    2.0    3.0    4.0    5.0    

Now try to remove item from empty Q.

Adding 1, 2, 3, 4, 5 to the stack.
The top of the stack holds a 5.0

Popping and printing all stack values:
5.0    4.0    3.0    2.0    1.0    

Now try to remove item from empty stack.
*/
