//012 Практика_ Копирование массивов
//Дан массив {1, 2, 3, 4, 5}.
//Реализовать программу ArrayCopy,
// которая создаст новый массив,
// скопирует в него все элементы исходного массива и
// выведет скопированный массив на консоль.
package academy.devonline.java.basic.section06_array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        //read sourse data
        int[] sourse = {1,2,3,4,5};


        //processing
        int[] destination = new int[5];
        System.out.println(Arrays.toString(destination));
        for (int i = 0; i < sourse.length; i++) {
            destination[i] = sourse[i];
        }

        //display results
        System.out.println(Arrays.toString(destination));
    }
}
