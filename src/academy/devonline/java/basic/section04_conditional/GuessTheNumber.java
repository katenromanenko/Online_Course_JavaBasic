//Реализовать программу GuessTheNumber, которая просит пользователя
// угадать число, которое загадал компьютер. Компьютер может загадать
// любой целое число в диапазоне от 0 до 9 включительно. После этого
// программа просит пользователя ввести число.
//Если пользователь угадает число, то отобразить сообщение:
// "Congratulations, you guessed the number!",
// если не угадал, то "Sorry, but your number is invalid! Try again later..."

package academy.devonline.java.basic.section04_conditional;

import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        //read source data
        var number = new Random().nextInt(10);
        System.out.println("Введите любое целое число в диапазоне от 0 до 9 включительно.");
        var userCase = new Scanner(System.in).nextInt();

        //processing
        String result;
        if (number==userCase) {
            result = "Congratulations, you guessed the number!";
        } else {
            result ="Sorry, but your number is invalid! Try again later...";
        }
        //display results
        System.out.println(result);


    }
}
