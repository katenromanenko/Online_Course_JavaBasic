//Практика "Таблица умножения(Вариант 3)"
// Реализовать программу MultiplicationTableCase2,
// которая выводит на консоль таблицу умножения в виде:
// столбиков — примеров, в 2 строчки, в 4 столбика.
package academy.devonline.java.basic.section05_cycles;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        //read source data
        var to = 9;     //до какого числа идет таблица умножения
        var colons = 4; //кол-во столбцов

        //processing
        //display results
        for (int r = 2; r <= to; r += colons) {
            for (int i = 2; i <= to; i++) {
                for (int j = r; j < r + colons && j <= to ; j++) {
                    var res = i * j;
                    System.out.print(j + " * " + i + " = " + res + "\t\t\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}