package ua.kiev.goit.victor.homework4;

/**
 * Создать класс вычисляющий расстояние между двумя точками, представленными координатами
 * в двумерном пространстве (x1, y1), (x2, y2).
 */
public class DistancesPoints {

    public static void main(String[] args) {
        int pointX1 = 1;
        int pointY1 = 1;
        int pointX2 = 2;
        int pointY2 = 2;
        double deltaX = (pointX2 - pointX1) * (pointX2 - pointX1);
        double deltaY = (pointY2 - pointY1) * (pointY2 - pointY1);
        double distancesPoints = Math.sqrt(deltaX + deltaY);
        System.out.println("Расстояние между двумя точками = "+distancesPoints);

    }

}
