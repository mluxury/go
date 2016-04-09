package ua.kiev.goit.victor.homework5;

import java.util.List;

/**
 * Выбрать один из алгоритмов сортировки массивов и реализовать его
 */
public class SortingArrays {
    public void sort(int[] sorts) {
        for(int i = sorts.length; i > 0; i--){
            for( int j = 0; j < i; j++){
                if (sorts[j] > sorts[j + 1]){
                    int tmp = sorts[j];
                    sorts[j] = sorts[j + 1];
                    sorts[j + 1] = tmp;
                }
            }
        }
    }
    public static void main(String args){
        int [] sort = new int []{3, 2, 8};
        System.out.println("ghjcnj   "  +sort);
    }
}
