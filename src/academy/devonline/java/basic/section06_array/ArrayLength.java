//Определение длины массива.

package academy.devonline.java.basic.section06_array;

import java.util.Arrays;

public class ArrayLength {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));

        //длина массива
        System.out.println(array.length);

        //последний элемент
        System.out.println(array[array.length - 1]);
    }
}
