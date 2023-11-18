package academy.devonline.java.basic.section05_cycles;

import javax.xml.validation.Validator;
import java.util.Random;
import java.util.Scanner;

public class BreakValidUsage {
    public static void main(String[] args) {
        //Invalid
        for (int i = 0; i < 10; i++){
            System.out.println(i + "");
            if (i == 5){
                break;
            }
        }
        System.out.println();

        //Valid
        for (int i = 0; i <= 5; i++){
            System.out.println(i + "");

        }
        System.out.println();

        //Valid usage (Правильное использование break)
        //1. Infinite loop (выход из бесконечного цикла)
        //2. Если нам надо выйти из цикла который является конечным,
        //то правильное использование break, заключается в том, что
        //условие выхода из цикла никаким образом не зависит от условия
        //прохождения цикла

        var number = new Random().nextInt(10);

        var quessed = false;
        for (int i = 0; i < 10; i++) {
            var userCase = new Scanner(System.in).nextInt();
            if (number > userCase) {
                System.out.println("number > " + userCase + " Try again:");
            } else if (number < userCase) {
                System.out.println("number < " + userCase + " Try again:");
            } else {
                quessed = true;
                System.out.println("Congratulations, you guessed the number!");
                break;
            }
        }
        if(!quessed){
            System.out.println("Limit reached");
        }
    }
    }

