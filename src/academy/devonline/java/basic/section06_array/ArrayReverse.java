//023 Практика_ Перестановка элементов в массиве
//Реализовать программу ArrayReverse,
// которая переставляет порядок в исходном массиве таким образом,
// чтобы первый элемент стал последним,
// а последний первым, затем втором элемент стал предпоследним,
// а предпоследний стал вторым и т.д.
package academy.devonline.java.basic.section06_array;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        //read sourse data
        int[] array ={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));


        //processing
        for (int i = 0; i < array.length/2; i++) {
            var temp = array[i];
            array[i]= array[array.length-i-1];
            array[array.length - i - 1] = temp;
        }

        //display results
        System.out.println(Arrays.toString(array));
    }
}
