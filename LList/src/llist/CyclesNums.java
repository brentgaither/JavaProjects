package llist;

import java.util.Scanner;

/**
 * **************************************
 * Brent Gaither Program XX Computer science Date
 * **************************************
 */
public class CyclesNums {

    public static void main(String[] args) {

        LList numbers = new LList();
        Scanner keyboard = new Scanner(System.in);
        int input;
        double next;
        double move;
        int numFound;
        double front;

        for (int i = 0; i < 100; i++) {
            numbers.addToRear(i % 4 + 1);
        }

        System.out.println("Enter a number between 10 and 35: ");
        input = keyboard.nextInt();

        for (int k = 0; k < input; k++) {

            next = numbers.removeFront();
            // System.out.println(next);
            for (int j = 0; j < next; j++) {
                numbers.removeFront();
            }
            move = numbers.removeFront();
            numbers.addToRear(move);
            //System.out.println(move);
        }
        numFound = numbers.howMany(1);
        System.out.println(numFound + " 1s");
        numFound = numbers.howMany(2);
        System.out.println(numFound + " 2s");
        numFound = numbers.howMany(3);
        System.out.println(numFound + " 3s");
        numFound = numbers.howMany(4);
        System.out.println(numFound + " 4s");

    }
}
