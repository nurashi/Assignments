import model.Shape;
import model.Circle;
import model.Rectangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);;
        Rectangle rectangle = new Rectangle(3,4);


        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    }
}
