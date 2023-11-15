package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        //read source data
        System.out.println("Введите номер дня недели(от 1 до 7 включительно:");
        var day = new Scanner(System.in).nextInt();

        //processing
        String result;
        if (day == 1){
            result = "Monday";
        }else if (day == 2){
            result = "Tuesday";
        }else if (day == 3) {
            result = "Wednesday";
        }else if (day == 4) {
            result = "Thursday";
        }else if (day == 5) {
            result = "Friday";
        }else if (day == 6) {
            result = "Saturday";
        }else if (day == 7) {
            result = "Sunday";
        }else{
            result = "Unsupported operator: " + day;
    }

        //display results
        System.out.println(result);
    }
}


