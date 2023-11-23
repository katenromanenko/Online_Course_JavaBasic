//Практика "Таблица умножения(Вариант 2)"
// Реализовать программу MultiplicationTableCase2,
// которая выводит на консоль таблицу умножения в виде:
// столбиков — примеров.
package academy.devonline.java.basic.section05_cycles;

public class MultiplicationTableCase2 {
    public static void main(String[] args) {
        //read source data
        var to = 9;  //до какого числа идет таблица умножения

        //processing
        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= to; j++) {
                var res = i * j;
                System.out.println(i + " * " + j + " = " + res);
            }
            System.out.println();
        }
        //display results

    }
}
