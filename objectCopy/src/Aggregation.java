
/**
 *
 * @author brentgaither lab 3a Walters
 */
import java.util.Scanner;

public class Aggregation {

    static Scanner keyboard = new Scanner(System.in);
    static RoomCarpet roomCarpet;

    public static void main(String[] args) {

        keyboard = new Scanner(System.in);

        double width = 0,
                length = 0,
                pricePerSqFt=0,
                area,
                totalCost;

        /* System.out.print("Input width ");
         width = keyboard.nextDouble();
         System.out.print("Input length ");
         length = keyboard.nextDouble();

         System.out.print("Input price per Square Ft ");
         pricePerSqFt = keyboard.nextDouble();*/
        RoomCarpet livingRoom = new RoomCarpet(15, 12, 10.50);
        RoomCarpet diningRoom = new RoomCarpet();
        diningRoom = livingRoom.copy();
        RoomCarpet den = new RoomCarpet(livingRoom);

        System.out.println("Livingroom area " + livingRoom.getArea() 
                + " price per Square foot " + livingRoom.getPricePerSqFt() 
                + " total cost " + livingRoom.getCarpetCost());

        System.out.println("Dining room area " + diningRoom.getArea() 
                + " price per Square foot " + diningRoom.getPricePerSqFt() 
                + " total cost " + diningRoom.getCarpetCost());

        System.out.println("Den area " + den.getArea() + " price per "
                + "Square foot " + den.getPricePerSqFt() + " total cost " 
                + den.getCarpetCost());
        
       
        
        System.out.println("Livingroom area " + livingRoom.getArea() 
                + " price per Square foot "+ livingRoom.getPricePerSqFt() 
                + " total cost " + livingRoom.getCarpetCost());
        System.out.println("Dining room area " + diningRoom.getArea(12,10)
                + " price per Square foot " + diningRoom.getPricePerSqFt() 
                + " total cost " + diningRoom.setCarpetCost(12,10));
        System.out.println("Den area " + den.getArea(14,11) 
                + " price per Square foot " + den.getPricePerSqFt() 
                + " total cost " + den.setCarpetCost(14,11));

      //  roomCarpet = new RoomCarpet(length, width, pricePerSqFt);


        /*System.out.println("The total cost of the room is $" 
        + roomCarpet.getCarpetCost());*/
    }

}

/*Input width 10
 Input length 12
 Input price per Square Ft 8
 The total cost of the room is 960.0

Livingroom area 180.0 price per Square foot 10.5 total cost 1890.0
Dining room area 180.0 price per Square foot 10.5 total cost 1890.0
Den area 180.0 price per Square foot 10.5 total cost 1890.0


Livingroom area 180.0 price per Square foot 10.5 total cost 1890.0
Dining room area 180.0 price per Square foot 10.5 total cost 1890.0
Den area 180.0 price per Square foot 10.5 total cost 1890.0
Livingroom area 180.0 price per Square foot 10.5 total cost 1890.0
Dining room area 120.0 price per Square foot 10.5 total cost 1260.0
Den area 154.0 price per Square foot 10.5 total cost 1617.0*/
