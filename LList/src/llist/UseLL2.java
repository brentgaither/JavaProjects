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

public class UseLL2 {

    public static void main(String[] args) {
        LList numbers = new LList();

        int totalInList;
        int numFound;
        System.out.println("Linked List Lab 3 -- Brent Gaither "
                + "and Travis Morrison");
        System.out.println("Here is the list");

        numbers.add(9);
        numbers.add(6);
        numbers.add(6);
        numbers.add(6);
        numbers.add(4);
        numbers.add(2);
        numbers.add(2);
        numbers.displayList();

        totalInList = numbers.howMany(0);
        System.out.println("\nThere are " + totalInList + " values in the list");

        numFound = numbers.howMany(9);
        System.out.println("The number 9 was found " + numFound + " time(s)");
        numFound = numbers.howMany(6);
        System.out.println("The number 6 was found " + numFound + " time(s)");
        numFound = numbers.howMany(2);
        System.out.println("The number 2 was found " + numFound + " time(s)");
        numFound = numbers.howMany(7);
        System.out.println("The number 7 was found " + numFound + " time(s)");

        System.out.println("Removing the first number in the list");
        numbers.removeFront();
        System.out.println("The first number was ");

        System.out.println("Now the list contains");
        numbers.displayList();
        totalInList = numbers.size();
        System.out.println("\nNow there are " + totalInList + " values in the list");
        //numbers.addToFront(5.5);

        System.out.println("Now I will destroy the list");
        numbers.destroyList();
        totalInList = numbers.size();
        System.out.println("\nThere are " + totalInList + " values in the list");

        numFound = numbers.howMany(6);
        System.out.println("The number 6 was found " + numFound + " time(s)");

        System.out.println("I am adding 3 to the end of the currently empty list");
        numbers.add(3);
        System.out.println("Here is the list");
        numbers.displayList();

        /*
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
