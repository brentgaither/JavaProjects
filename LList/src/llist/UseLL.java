package llist;

// Java Linked List Lab 1: useLL.java 
// Written by Prof. Walters
// This program illustrates the use of a linked list.
// It uses the floating-point LList class that contains
// the following methods YOU will be writing:
//   addToFront  -- adds a new node to the front of the list
//   addToRear   -- adds a new node to the end of the list
//   add         -- inserts a new node in (ascending) data value order  
//   displayList -- traverses the list front to back, displaying
//                  the data value of each node it comes to
//   remove      -- deletes the first occurrence of the node holding 
//                  the specified value
public class UseLL {

    public static void main(String[] args) {
        LList numbers = new LList();

        System.out.println("Linked List Lab 1 -- Brent Gaither "
                + "and Travis Morrison");
        System.out.println("\nFour numbers will initially be "
                + "inserted in value order into the list.");
        System.out.println("They are: 8.1, 4.1, 9.9, 6.3");

        numbers.add(8.1);
        numbers.add(4.1);
        numbers.add(9.9);
        numbers.add(6.3);
        numbers.add(8.1);
        numbers.addToFront(4.1);
        numbers.add(9.9);
        numbers.add(6.3);

        System.out.println("\nThe values in the list are:");
        numbers.displayList();
        System.out.println("\nNotice how the add method put them\n"
                + "into the list in ascending order.");

        System.out.println("\nNow we'll append 5.0 to the end of the list.");
        numbers.addToRear(5.0);

        System.out.println("\nNow we'll append 5.0 to the end of the list again.");
        numbers.addToRear(5.0);

        System.out.println("\nThe values in the list are now:");
        numbers.displayList();
        System.out.println("\nNotice that addToRear added the number\n"
                + "5.0 to the end of the list, not in order.");

        System.out.println("\nNow we will add 5.5 front of the list.");
        numbers.addToFront(5.5);

        System.out.println("\nThe values in the list are now:");
        numbers.displayList();
        System.out.println("\nNotice that addToFront added the number\n"
                + "5.5 to the front of the list, not in order.\n");

        System.out.println("We will now remove:\n"
                + "the number at the front of the list (5.5)\n"
                + "the number at the end of the list (5.0), and \n"
                + "the number in the middle of the list (8.1).");
        numbers.remove(5.5);
        numbers.remove(5.0);
        numbers.remove(8.1);

        System.out.println("\nThe values remaining in the list are: ");
        numbers.displayList();

         numbers.destroyList();/*
         System.out.println("\nThe values remaining in the list are: ");
         numbers.displayList();
        
         numbers.add(4.1);
         numbers.add(9.9);
         numbers.add(6.3);
        
         System.out.println("\nThe values remaining in the list are: ");
         numbers.displayList();*/
    }// End main

}// End useLL clas declaration

/* Sample run output
 Linked List Lab 1 -- Student's Name
    
 Four numbers will initially be inserted in value order into the list.
 They are: 8.1, 4.1, 9.9, 6.3
    
 The values in the list are:
 4.1    6.3    8.1    9.9    
 Notice how the add method put them
 into the list in ascending order.
    
 Now we'll append 5.0 to the end of the list.
    
 The values in the list are now:
 4.1    6.3    8.1    9.9    5.0    
 Notice that addToRear added the number
 5.0 to the end of the list, not in order.
    
    
 Now we will add 5.5 front of the list.
    
 The values in the list are now:
 5.5    4.1    6.3    8.1    9.9    5.0    
 Notice that addToFront added the number
 5.5 to the front of the list, not in order.
    
 We will now remove:
 the number at the front of the list (5.5)
 the number at the end of the list (5.0), and 
 the number in the middle of the list (8.1).
    
 The values remaining in the list are: 
 4.1    6.3    9.9  
	 
 */
