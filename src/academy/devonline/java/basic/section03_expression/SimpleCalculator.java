////Практика "Простой калькулятор"
// Реализовать программу SimpleCalculator,
// которая запрашивает с консоли переменные a и b
// и выводит результат всех арифметических операций
// в формате: операнд1 операция операнд2 равно результат.
package academy.devonline.java.basic.section03_expression;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //read source data
        System.out.println("Enter 'a'");
        var a = new Scanner(System.in ).nextInt();
        System.out.println("Enter 'b'");
        var b = new Scanner(System.in ).nextInt();

        //processing
        var aPlusB = a + b;
        var aMinusB = a - b;
        var aMulB = a * b;
        var aDivB = a / b;
        var aModB = a % b;

        //display results
        System.out.println("a + b = " + aPlusB);
        System.out.println("a - b = " + aMinusB);
        System.out.println("a * b = " + aMulB);
        System.out.println("a / b = " + aDivB);
        System.out.println("a % b = " + aModB);
    }
}
