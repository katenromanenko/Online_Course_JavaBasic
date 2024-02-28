//021 Практика_ Посчитать сколько раз встречается элемент в массиве
//Дан массив [5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2]
//Реализовать программу ArrayElementCount,
// которая выведет на консоль сколько раз
// встречается число 2 в данном массиве.
package academy.devonline.java.basic.section06_array;

public class ArrayElementCount {
    public static void main(String[] args) {
        //read sourse data
        int[] array ={5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};


        //processing
        var min = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 2){
                min = min + 1;
            }
        }

        //display results
        System.out.println(min);

    }
}
