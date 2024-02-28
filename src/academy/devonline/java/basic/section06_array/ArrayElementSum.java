//016 Практика_ Сумма элементов в массиве
//Дан массив {1, 2, 3, 4, 5}.
//Реализовать программу ArrayElementSum,
// которая рассчитает и выведет на консоль сумму всех элементов массива.
package academy.devonline.java.basic.section06_array;

import java.util.Arrays;

public class ArrayElementSum {
    public static void main(String[] args) {
        //read sourse data
        int[] sourse = {1,2,3,4,5};


        //processing
        var sum = 0;
        System.out.println(sum);
        for (int i = 0; i <= sourse.length; i++) {
            sum = sum + i;
        }

        //display results
        System.out.println(sum);
    }
    }

