//018 Практика_ Поиск минимального элемента в массиве
//Дан массив [1, -2, 8, 0, 5].
//Реализовать программу FindMinElement,
// которая найдет минимальный элемент и выведет его на консоль.
package academy.devonline.java.basic.section06_array;

public class FindMinElement {
    public static void main(String[] args) {
    //read sourse data
    int[] array ={1, -2, 8, 0, 5};


    //processing
    var min = array[0];
    for (int i = 1; i < array.length; i++) {
        if(array[i] < min){
            min = array[i];
        }
    }

    //display results
        System.out.println(min);
}
}
