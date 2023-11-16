//Реализовать программу DisplayMaxNumber,
// которая выводит максимально число из двух предложенных.

package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class DisplayMaxNumber {
    public static void main(String[] args){
        //read source data
        System.out.println("Введите 1 число: ");
        var number1 = new Scanner(System.in).nextInt();
        System.out.println("Введите 2 число: ");
        var number2 = new Scanner(System.in).nextInt();

        //processing
        var result = number1 > number2 ? number1 : number2;

        //display results
        System.out.println("Большее число: " + result);
    }
}
