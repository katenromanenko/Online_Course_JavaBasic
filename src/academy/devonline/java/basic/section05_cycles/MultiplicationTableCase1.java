//Практика "Таблица умножения(Вариант 1)"
// Реализовать программу MultiplicationTableCase1,
// которая выводит на консоль таблицу умножения в виде:
// где
//первый столбец отображает число;
//первая строка отображает число b;
//на пересечении — результат умножения a * b.
package academy.devonline.java.basic.section05_cycles;

public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        //read source data
        var to = 9;

        //processing
        for (int i = 1; i <= to; i++) {
            for (int j = 1; j <= to; j++) {
                var res = i * j;
                System.out.print((res == 1 ? " " : res) + "\t");
            }
            System.out.println();
        }
        //display results

    }
}
