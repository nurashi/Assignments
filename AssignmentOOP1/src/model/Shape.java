package model;
import java.util.ArrayList;

public class Shape {
    public ArrayList<Point> points;


    public Shape(){
        points = new ArrayList<>();
    }


    public void addPoint(Point p) {
        points.add(p);
    }

    public double calculatePerimeter() {
        double result = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            result = result + points.get(i).distance(points.get(i + 1));
        }
        return result;
    }

    public double getLongestSide() {
        double max = 0;
        for(int i = 0; i < points.size() - 1; i++) {
            if(points.get(i).distance(points.get(i + 1)) > max) {
                max = points.get(i).distance(points.get(i + 1));
            }
        }
        return max;
    }

    public double calculateAvarageSide() {
        return calculatePerimeter() / points.size();
    }

}
