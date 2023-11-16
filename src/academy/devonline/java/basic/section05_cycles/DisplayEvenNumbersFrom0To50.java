//Реализовать программу DisplayEvenNumbersFrom0To50,
// которая выводит на консоль
// все четные целые числа от 0 до 50 (включительно).
package academy.devonline.java.basic.section05_cycles;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {
        //read source data
        var from = 0;
        var to = 50;
        var step = 2;

        //processing
        //display results
        for (int i = from; i <= to; i += step){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
