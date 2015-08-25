package llist;

// Class declaration for a Node class. Each node holds
// a double data value and a reference (i.e. pointer)
// to another node.

public class Node
{
   private double  value;
	private Node next;
	
	// Constructors
	public Node()
	{   next = null;
	}
	
	public Node (double val)
	{   value = val;
	    next = null;
	}
	
	public Node (double val, Node n)
	{   value = val;
	    next = n;
   }
	
	// Get functions (accessors)
	public double getValue()
	{   return value;
	}
	
	public Node getNext()
	{   return next;
	}
	
	// Set functions (mutators)
	public void setValue(double val)  // Never used
	{   value = val;
	}
	
	public void setNext(Node n)
	{   next = n;
	} 
	
}// End of Node class