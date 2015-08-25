/**
 *
 * @author brentgaither
 * lab 3a 
 * Walters
 */
import java.util.Scanner;

public class Aggregation {

    static Scanner keyboard = new Scanner(System.in);
    static RoomCarpet roomCarpet;

    public static void main(String[] args) {

        keyboard = new Scanner(System.in);

        double width,
               length;

        System.out.print("Input width ");
        width = keyboard.nextDouble();
        System.out.print("Input length ");
        length = keyboard.nextDouble();

        System.out.print("Input price per Square Ft ");
        double pricePerSqFt = keyboard.nextDouble();

        roomCarpet = new RoomCarpet(length, width, pricePerSqFt);
        double totalCost = roomCarpet.getCarpetCost();

        System.out.println("The total cost of the room is " + totalCost);
    }

}

/*Input width 10
Input length 12
Input price per Square Ft 8
The total cost of the room is 960.0*/
