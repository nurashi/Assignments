import model.Shape;
import model.Point;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        ArrayList<Point> points = new ArrayList<>();

        shape.addPoint(new Point(3.4, 5.6));
        shape.addPoint(new Point(1.2, 6.8));
        shape.addPoint(new Point(4.5, 9.7));


        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.calculateAvarageSide());
    }
}
