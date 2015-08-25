
/**
 *
 * @author brentgaither
 */
public class RoomCarpet {

    RoomDimension rd;
    double pPerSqFt;

    public RoomCarpet(double length, double width, double pricePerSqFt) {
        rd = new RoomDimension(length, width);
        pPerSqFt = pricePerSqFt;

    }
public RoomCarpet (){
    pPerSqFt=10;
    rd = new RoomDimension ();
}
    public double getCarpetCost() {
        double totalCost;

        double area = rd.getArea();

        totalCost = area * pPerSqFt;

        return totalCost;
    }
}
