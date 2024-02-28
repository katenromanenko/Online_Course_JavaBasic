//014 Практика_ Копирование массивов используя индексы
//Реализовать программу ArrayCopyRange,
// которая создаст новый массив,
// скопирует в него все элементы исходного массива
// начиная со startIndex и заканчивая endIndex
// и выведет скопированный массив на консоль!
package academy.devonline.java.basic.section06_array;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {
        //read sourse data
        int[] sourse = {1,2,3,4,5};
        //Обычно в Java при задании стартового индекса и
        //последнего индекса, используется следующие правило:
        //по умолчанию, элемент который находится на стартовом индексе
        //попадает в результирующий массив.
        //А индекс последнего исключается из результирующего массива.
        int startIndex = 1;
        int endIndex = 3;


        //processing
        int[] destination = new int[endIndex-startIndex];
        System.out.println(Arrays.toString(destination));
        for (int i = 0; i < destination.length; i++) {
            destination[i] = sourse[i + startIndex];
        }

        //display results
        System.out.println(Arrays.toString(destination));
    }
}


