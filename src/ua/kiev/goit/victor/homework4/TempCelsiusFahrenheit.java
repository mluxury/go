package ua.kiev.goit.victor.homework4;

/**
 * Создать класс преобразующий значение температуры по шкале Цельсия в значение по шкале Фаренгейта и в обратном направлении.
 */
public class TempCelsiusFahrenheit {

    public static void main(String[] args) {
        int celsiusTemp = 100;
        double fahrenheitTemp = 1.8 * celsiusTemp + 32;
        System.out.println(celsiusTemp+" Градусов Цельсия =  " +fahrenheitTemp+ " Градусов Фаренгейта");

        int fahrenheitTemp1 = 212;
        double celsiusTemp1 = (fahrenheitTemp1 - 32) / 1.8;
        System.out.println(fahrenheitTemp1+ " Градусов Фаренгейта = "+celsiusTemp1+ "  Градусов Цельсия");

    }

}
