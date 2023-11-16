//Изменить программу GuessTheNumber,
// чтобы, вместо конструкции if-else,
// использовать тернарный оператор.

package academy.devonline.java.basic.section04_conditional;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithTernaryOperator {
    public static void main(String[] args) {
        //read source data
        var number = new Random().nextInt(10);
        System.out.println("Введите любое целое число в диапазоне от 0 до 9 включительно.");
        var userCase = new Scanner(System.in).nextInt();

        //processing
        String result = number == userCase ? "Congratulations, you guessed the number!" :
                "Sorry, but your number is invalid! Try again later...";

        //display results
        System.out.println(result);
    }
}
