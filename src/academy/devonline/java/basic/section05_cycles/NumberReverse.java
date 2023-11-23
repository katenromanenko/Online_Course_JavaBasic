//Практика "Реверс числа"
// Реализовать программу NumberReverse,
// которая для заданного числа создает его реверсивную версию.
// Реверсивная версия - это число написанное задом наперед.
package academy.devonline.java.basic.section05_cycles;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        //read source data
        System.out.println("Введите число:");
        var number = new Scanner(System.in).nextInt();

        //processing
        var result = 0;
        var temp = number; //переменная для числа уменьшающаяся по разрядам
        while (temp!=0){
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /=10; //temp = temp /10
        }

        //display results
        System.out.println("Reverse number: " + result);
    }
}
