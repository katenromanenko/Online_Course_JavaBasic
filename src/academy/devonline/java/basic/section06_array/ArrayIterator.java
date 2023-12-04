//Шаблоны кода для обхода массива.

package academy.devonline.java.basic.section06_array;

public class ArrayIterator {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        //шаблон для обхода массива -> array.fori
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //шаблон для обхода массива в другую сторону -> array.forr
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //шаблон для обхода массива -> array.for
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
