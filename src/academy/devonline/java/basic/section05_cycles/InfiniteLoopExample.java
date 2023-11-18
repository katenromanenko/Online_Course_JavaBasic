package academy.devonline.java.basic.section05_cycles;

import java.util.Scanner;

public class InfiniteLoopExample {
    public static void main(String[] args) {
        //рекомендации по использованию бесконечных циклов
        //если нам заранее не известно количество итераций которые
        //нужно выполнить в нашей программе.
        while (true) {
            var number = new Scanner(System.in).nextInt();
            if (number == 0){
                break;
            }
            System.out.println(number * number);
        }
        System.out.println("Bye!");
    }
}
