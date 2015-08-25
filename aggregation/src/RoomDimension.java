
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
    public RoomDimension(){
        length = 10;
        width = 10;
    }

    public double getArea() {

        double area = length * width;

        return area;
    }
}
