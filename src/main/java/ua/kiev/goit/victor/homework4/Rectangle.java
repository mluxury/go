package ua.kiev.goit.victor.homework4;

/**
 * Find the area of a rectangle
 */
public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle() {
    }

    public Rectangle (double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double findSquare(){
        check();
        double rectangleSquare = side1 * side2;
        return rectangleSquare;
    }

    private void check() {
        if (side1 < 0 || side2 < 0){
            throw new IllegalArgumentException();
        }
    }
}
