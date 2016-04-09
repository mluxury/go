package ua.kiev.goit.victor.homework5;

/**
 * Создать класс, который осуществляет поиск максимального и минимального элемента в массиве из целых чисел (int[])
 */
public class SearchMinMax {
    public static void main(String[] args) {
        int [] searchNumber = {1, 2, 3, 4, 5};
        int max = searchNumber[0];
        int min = searchNumber[0];
        for(int i = 0; i != searchNumber.length; i ++){
            if(searchNumber[i] > max){
                max = searchNumber[i];
            }
            if(searchNumber[i] < min){
                min = searchNumber[i];
            }
        }
        System.out.println("минимальное число " + min);
        System.out.println("максимальное число " + max);
    }
}