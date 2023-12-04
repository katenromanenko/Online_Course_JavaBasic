//008 Ошибка ArrayIndexOutOfBoundsException.

package academy.devonline.java.basic.section06_array;

import java.util.Arrays;

public class ArrayErrors {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 4, 5};

        //System.out.println(array[-1]);
        //System.out.println(array[500]);
        System.out.println(array[4]);
    }
}
