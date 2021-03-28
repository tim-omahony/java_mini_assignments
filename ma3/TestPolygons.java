package ma3;

public class TestPolygons {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon();
        RegularPolygon polygon3 = new RegularPolygon();
        RegularPolygon polygon4 = new RegularPolygon();

        polygon1.setN(3);
        polygon1.setLength(10.0);
        System.out.println("polygon1: " + polygon1.toString() + "\n");
        System.out.println("polygon1 perimeter: " + polygon1.getPerimeter() + "\n");
        System.out.println("polygon1 area: " + polygon1.getArea() + "\n");

        polygon2.setN(6);
        polygon2.setLength(7.5);
        System.out.println("polygon2: " + polygon2.toString() + "\n");
        System.out.println("polygon2 perimeter: " + polygon2.getPerimeter() + "\n");
        System.out.println("polygon2 area: " + polygon2.getArea() + "\n");

        polygon3.setN(8);
        polygon3.setLength(3.5);
        System.out.println("polygon3: " + polygon3.toString() + "\n");
        System.out.println("polygon3 perimeter: " + polygon3.getPerimeter() + "\n");
        System.out.println("polygon3 area: " + polygon3.getArea() + "\n");

        polygon4.setN(12);
        polygon4.setLength(4.0);
        System.out.println("polygon4: " + polygon4.toString() + "\n");
        System.out.println("polygon4 perimeter: " + polygon4.getPerimeter() + "\n");
        System.out.println("polygon4 area: " + polygon4.getArea() + "\n");

// checks each polygon to see which has the smallest perimeter
        if      ((polygon1.getPerimeter() < polygon2.getPerimeter()) &&
                (polygon1.getPerimeter() < polygon3.getPerimeter()) &&
                (polygon1.getPerimeter() < polygon4.getPerimeter())) {
            System.out.println("Polygon 1 has the smallest perimeter." + polygon1.toString());
        }
        else if     ((polygon2.getPerimeter() < polygon1.getPerimeter()) &&
                    (polygon2.getPerimeter() < polygon3.getPerimeter()) &&
                    (polygon2.getPerimeter() < polygon4.getPerimeter())) {
            System.out.println("Polygon 2 has the smallest perimeter." + polygon2.toString());
        }
        else if     ((polygon3.getPerimeter() < polygon1.getPerimeter()) &&
                    (polygon3.getPerimeter() < polygon2.getPerimeter()) &&
                    (polygon3.getPerimeter() < polygon4.getPerimeter())) {
            System.out.println("Polygon 3 has the smallest perimeter." + polygon3.toString());
        }
        else if     ((polygon4.getPerimeter() < polygon1.getPerimeter()) &&
                    (polygon4.getPerimeter() < polygon2.getPerimeter()) &&
                    (polygon4.getPerimeter() < polygon3.getPerimeter())) {
            System.out.println("Polygon 4 has the smallest perimeter." + polygon4.toString());
        }
// checks each polygon to see which has the greatest area
        if      ((polygon1.getArea() > polygon2.getArea()) &&
                (polygon1.getArea() > polygon3.getArea()) &&
                (polygon1.getArea() > polygon4.getArea())) {
            System.out.println("Polygon 1 has the greatest area." + polygon1.toString());
        }
        else if     ((polygon2.getArea() > polygon1.getArea()) &&
                    (polygon2.getArea() > polygon3.getArea()) &&
                    (polygon2.getArea() > polygon4.getArea())) {
            System.out.println("Polygon 2 has the greatest area." + polygon2.toString());
        }
        else if     ((polygon3.getArea() > polygon1.getArea()) &&
                    (polygon3.getArea() > polygon2.getArea()) &&
                    (polygon3.getArea() > polygon4.getArea())) {
            System.out.println("Polygon 3 has the greatest area." + polygon3.toString());
        }
        else if     ((polygon4.getArea() > polygon1.getArea()) &&
                    (polygon4.getArea() > polygon2.getArea()) &&
                    (polygon4.getArea() > polygon3.getArea())) {
            System.out.println("Polygon 4 has the greatest area." + polygon4.toString());
        }
    }
}
