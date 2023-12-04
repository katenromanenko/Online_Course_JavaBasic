//Пример_Линейный поиск элемента в массиве
//надо определить индекс заданного числа

package academy.devonline.java.basic.section06_array;

public class LinearSearch {
    public static void main(String[] args) {
        //read source data
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var query = 6;

        //processing

        //создаем переменную и присвоим ей дефолтное значение
        var index = -1;

        //проходимся по массиву
        for (int i = 0; i < array.length; i++) {
            //мы берем каждый элемент массива и сравнимая его
            //со значением query
            if (array[i] == query){
                //значит, что элемент присутствует в массиве
                //значит надо сохранить индекс
                index = i;
                break;
            }
        }
        //display results;
        System.out.println(index);
    }
}
