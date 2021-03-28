package ma3;

import java.lang.Math;
public class RegularPolygon {
    private int n;
    private double length;

    public RegularPolygon() {
        n = 3;
        length = 1;
    }

    public RegularPolygon(int n, double length) {
        this.n = n;
        this.length = length;
    }

    public int getN() {
        return n;
    }
//  if the number for n or length is less than 0 an error message is displayed and the default values for both are used.
    public void setN(int n) {
        if (n < 0)
            System.out.println("Please enter a positive integer.");
        else
            this.n = n;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length < 0)
            System.out.println("Please enter a positive integer.");
        else
            this.length = length;
    }

    public double getPerimeter() {
        return n * length;
    }

    public double getArea() {
        return (n * (Math.pow(length, 2)))/(4 * (Math.tan(Math.PI/n)));
    }

    @Override
    public String toString() {
        return "\n n=" + n + "\n length=" + length;
    }
}
