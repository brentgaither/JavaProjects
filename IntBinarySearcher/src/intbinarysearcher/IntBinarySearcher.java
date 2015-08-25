package intbinarysearcher;

/* ************************************************************
 IntBinarySearcher Class 
 This program searches for values in a sorted integer array.
 It originally used a NON-recursive binary search algorithm.
 It was revised by Brent Gaither to perform a recursive 
 binary search.
 **************************************************************/
public class IntBinarySearcher {

    public static void main(String[] args) {
        int[] A = {3, 6, 7, 9, 12, 14, 16, 18, 22, 26, 31, 34, 35};
        int foundAt;

        for (int searchFor = 7; searchFor <= 45; searchFor += 7) {
            foundAt = search(A, 0, A.length - 1, searchFor);

            if (foundAt == -1) {
                System.out.println(searchFor + " was not found in the array. \n");
            } else {
                System.out.println(searchFor + " was found in element " + foundAt
                        + " of the array. \n");
            }
        }
    }// End main

    /**
     * ********************************************************************
     * search This method performs a binary search on elements first through
     * last of an int array. If the number is found, its array subscript is
     * returned. Otherwise, -1 is returned indicating the value was not found in
     * the array.
     *
     * @param array The array to search.
     * @param first The lower bound of the part of the array to search in.
     * @param last The upper bound of the part of the array to search in.
     * @param value The value to search for.
   **********************************************************************
     */
    public static int search(int[] array, int first, int last, int value) {
        int middle;                        // Mid point of search

        int position = -1;                 // Position of search value
        // -1 indicates it has not been found

                 // Flag. Value has not been found yet.

      // Search for the value so long as it has not yet been found and
        // there are still array locations left to search in.
        // Calculate mid point
        middle = (first + last) / 2;
  
        if (first>last)
            return -1;
        
        if (array[middle] == value) // Is value at the mid point?
        {
           return middle;
        } else if (value > array[middle]) // else is value in the upper half?
        {
            return search (array, first+1, last,value); // if so, search there next
        } else // else, search the lower half
        {
            return search (array, first, middle-1,value);
        }

        // Return the position of the item, or -1 item was not found
        
    }// End search
}// End of IntBinarySearcher class declaration
