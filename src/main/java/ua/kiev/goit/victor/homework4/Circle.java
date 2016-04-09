package ua.kiev.goit.victor.homework4;

/**
 * Find the area of a circle
 */
public class Circle {
    private double radius;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findSquare(){
        double circleSquare = Math.PI * radius * radius;
        return circleSquare;
    }
}
