//Практика "Вывод чисел от 100 до 1"
// Реализовать программу DisplayNumbersFrom100To1,
// которая выводит на консоль все целые числа
// от 100 до 1 (включительно).

package academy.devonline.java.basic.section05_cycles;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        //read source data
        var from = 100;
        var to = 1;
        var step = 1;

        //processing
        //display results
        for (int i = from; i >=to; i -= step){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
