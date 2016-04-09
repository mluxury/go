package ua.kiev.goit.victor.homework4;

/**
 * Calculating the distance between two points represented by the coordinates in three dimensions
 */
public class DistancesPoints {
    private double pointX1 = 1;
    private double pointY1 = 1;
    private double pointX2 = 2;
    private double pointY2 = 2;

    public DistancesPoints(){
    }

    public DistancesPoints(double pointX1, double pointY1, double pointX2, double pointY2) {
        this.pointX1 = pointX1;
        this.pointY1 = pointY1;
        this.pointX2 = pointX2;
        this.pointY2 = pointY2;
    }

    public double getPointX1() {
        return pointX1;
    }

    public void setPointX1(double pointX1) {
        this.pointX1 = pointX1;
    }

    public double getPointY1() {
        return pointY1;
    }

    public void setPointY1(double pointY1) {
        this.pointY1 = pointY1;
    }

    public double getPointX2() {
        return pointX2;
    }

    public void setPointX2(double pointX2) {
        this.pointX2 = pointX2;
    }

    public double getPointY2() {
        return pointY2;
    }

    public void setPointY2(double pointY2) {
        this.pointY2 = pointY2;
    }

    public double findDistance(){
        double deltaX = (pointX2 - pointX1) * (pointX2 - pointX1);
        double deltaY = (pointY2 - pointY1) * (pointY2 - pointY1);
        double distancesPoint = Math.sqrt(deltaX + deltaY);
        return distancesPoint;
    }
}
