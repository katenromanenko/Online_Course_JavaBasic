//Вывод массива на консоль.

package academy.devonline.java.basic.section06_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DisplayArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5]; //{0, 0, 0, 0, 0}

        System.out.println(Arrays.toString(array1)); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(array2)); //[0, 0, 0, 0, 0]

        System.out.println(array1); //[I@1b28cdfa
        System.out.println(array2); //[I@eed1f14
    }
}
