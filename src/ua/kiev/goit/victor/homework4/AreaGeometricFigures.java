package ua.kiev.goit.victor.homework4;

/**
 * Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.
 */
public class AreaGeometricFigures {

    public static void main(String[] args){
        // Вычисляем площадь Треугольника по формуле Герона

        int trigonSide1 = 3;
        int trigonSide2 = 4;
        int trigonSide3 = 5;
        double p = (trigonSide1 + trigonSide2 + trigonSide3) / 2;
        double trigonSquare = Math.sqrt(p * (p - trigonSide1) * (p - trigonSide2) * (p - trigonSide3));
        System.out.println("Площадь триугольника = " +trigonSquare);

        // Вычисляем площадь Прямоугольника
        int rectangleSide1 = 5;
        int rectangleSide2 = 10;
        double rectangleSquare = rectangleSide1 * rectangleSide2;
        System.out.println("Площадь прямоугольника = " +rectangleSquare);

        // Вычисляем площадь Круга
        int radius = 5;
        double circleSquare = Math.sqrt(radius) * Math.PI;
        System.out.println("Площадь круга = " +circleSquare);

    }

}
