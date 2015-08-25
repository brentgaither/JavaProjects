
import java.util.Scanner;

/**
 *
 * @author brentgaither
 */
public class RoomDimension {

    private double length,
            width;

    public RoomDimension(double lengthIn, double widthIn) {
        length = lengthIn;
        width = widthIn;
    }

    public RoomDimension() {
        length = 10;
        width = 10;
    }

    public RoomDimension(RoomDimension l) {
        this.length = l.getLength();
        this.width = l.getWidth();
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double l) {
        length = l;
    }

    public void setWidth(double w) {
        width = w;
    }

    public double getArea() {

        double area = length * width;

        return area;
    }
    public double setArea(double l, double w){
      double area = l * w;
        return area;
    }
}
