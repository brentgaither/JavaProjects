
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

    public RoomCarpet() {
        rd = new RoomDimension();
        pPerSqFt = 10;
    }

    public RoomCarpet(RoomCarpet c) {
        rd = new RoomDimension(c.getLength(), c.getWidth());
        pPerSqFt = c.getPricePerSqFt();
    }

    public double getCarpetCost() {
        double totalCost;

        double area = rd.getArea();

        totalCost = area * pPerSqFt;

        return totalCost;
    }
    public double setCarpetCost(double l, double w){
        double totalCost;
        double area;
        area = rd.setArea(l, w);
        totalCost = area *pPerSqFt;
        return totalCost;
    }

    public double getWidth() {
        return rd.getWidth();
    }

    public double setWidth(double width) {
        return width;
    }

    public double getLength() {
        return rd.getLength();
    }

    public double setLength(double length) {
        return length;
    }

    public double getArea() {
        return this.rd.getArea();
    }
    public double getArea(int l,int w){
        return l*w;
    }
    public double setPricePerSqFt(double cost) {
       return pPerSqFt = cost;
    }

    public double getPricePerSqFt() {
        return pPerSqFt;
    }

    public RoomCarpet copy() {
        RoomCarpet rc = new RoomCarpet(getLength(), getWidth(), 
                getPricePerSqFt());       
        return rc;
    }
}

