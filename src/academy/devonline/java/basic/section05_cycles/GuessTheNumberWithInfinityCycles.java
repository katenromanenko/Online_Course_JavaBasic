//Изменить программу GuessTheNumber,
// которая просит пользователя угадать число,
// которое загадал компьютер.
// Компьютер может загадать любой целое число
// в диапазоне от 0 до 9 включительно.
// После этого программа просит пользователя ввести число.
//Т.е. программа будет бесконечно запрашивать
// число от пользователя, пока он его не угадает.

package academy.devonline.java.basic.section05_cycles;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithInfinityCycles {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);


        while (true) {
            //read source data
            System.out.println("Введите любое целое число в диапазоне от 0 до 9 включительно.");
            var userCase = new Scanner(System.in).nextInt();

            //processing
            if (number > userCase) {
                //display results
                System.out.println("number > " + userCase + " Try again:");
            } else if (number < userCase) {
                //display results
                System.out.println("number < " + userCase + " Try again:");
            } else {
                //display results
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
    }
}
