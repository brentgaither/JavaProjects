package llist;

// Declaration for a class
// that implements a linked list
// Begun by Prof. Walters
// Completed by Brent Gaither Travis Morrison 5/20/14
public class LList {

    private Node head,
            tail;

    private int size;

    // Constructor
    public LList() {
        startNewList();
    }

    /*******************************************************
                startNewList
    creates a new list by deleting the old list
    *******************************************************/
    private void startNewList() {
        head = null;
        tail = null;
        size =0;
    }

    // Public methods
        /*******************************************************
                isEmpty
      Determines if list is empty
    *******************************************************/
    public boolean isEmpty() {
        return (head == null);
    }

    public int size() // returns the length of the list
    {
        return size;
    }
    /*******************************************************
                addToFront
    Adds a number to the front of the list
    *******************************************************/
    public void addToFront(double val) {
        Node newGuy = new Node(val, head); //create new node
        head = newGuy;
        size++;
        if (size == 1) {
            tail = newGuy;
        }
    }
    /*******************************************************
                addToRear
    Adds a number to the end of the list
    *******************************************************/
    public void addToRear(double val) {
        if (size == 0) {
            addToFront(val);
        } else {
            Node newGuy = new Node(val);
            tail.setNext(newGuy);
            tail = newGuy;
            size++;
        }

    }
    /*******************************************************
                Add
    Adds a number to the list 
    *******************************************************/
    public void add(double val) // Adds value in order
    {

        if (size == 0 || val < head.getValue()) {
            addToFront(val);
        } else if (val >= tail.getValue()) {
            addToRear(val);
        } else {
            Node prev = null;
            Node ptr = head;
            Node newGuy = new Node(val);

            while (val >= ptr.getValue()) {
                prev = ptr;
                ptr = ptr.getNext();
            }
            newGuy.setNext(ptr);
            prev.setNext(newGuy);
            size++;
        }
    }
    /*******************************************************
                isInList
    Checks to see if a given value is in the list
    *******************************************************/
    public boolean isInList(double val) {

        Node ptr = new Node();

        ptr = head;
        while (ptr != null) {
            if (val == ptr.getValue()) {
                return true;
            }
            ptr = ptr.getNext();
        }
        return false;

    }
    /*******************************************************
                displayList
    Displays the list 
    *******************************************************/
    public void displayList() // Prints the value field of each node
    {
        Node ptr = new Node();
        ptr = head;

        while (ptr != null) {
            System.out.print(ptr.getValue() + "  ");
            ptr = ptr.getNext();
        }
    }
    /*******************************************************
                howMany
   Counts how many times a value is in the list
    *******************************************************/
    public int howMany(double val) // Counts how many times 
    {                               // val appears in the list
        int numFound = 0;
        Node ptr = new Node();
        ptr = head;

        while (ptr != null) {

            if (val == ptr.getValue()) {
                numFound++;
            }
            ptr = ptr.getNext();
        }
        return numFound;
    }
    /*******************************************************
                remove
    Removes the 1st node containing a given value.
    *******************************************************/
    public double remove(double val) 
    {
        Node ptr = new Node();
        Node prev = new Node();
        ptr = head;
        prev = null;

        isInList(val);
              
        if (val == head.getValue()) {
            removeFront();
            return val;
        }

        while (ptr.getValue() != val && ptr.getNext() != null) {
            prev = ptr;
            ptr = ptr.getNext();           
        }
        
        if (ptr.getValue() == val) {
           prev.setNext(ptr.getNext());
        }

        return val;

    }
    /*******************************************************
                removeFront
    Removes the first node in the list
    *******************************************************/
    public double removeFront() // Removes first node and returns val
    {
        double front;
        
        front = head.getValue();
        head = head.getNext();
        if(size == 0){
            tail = head;
            return -1;
        }
        return front;

    }
    /*******************************************************
                destroyList
    Deletes the list by setting head and tail to null
    *******************************************************/
    public void destroyList() {

        head = null;
        tail =null;
        size = 0;

    }
}

