////Практика "Вывод дня недели с помощью Switch"
// Реализовать программу WeekDayWithSwitch,
// которая запрашивает номер дня недели (от 1 до 7 включительно),
// а затем отображает название дня недели: Если 1, то Monday (Понедельник),
// если 2, то Tuesday (Вторник) и т.д.
//
//Вместо конструкции if-else, использовать операцию switch.

package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class WeekDayWithSwitch {
    public static void main(String[] args) {
        //read source data
        System.out.println("Введите номер дня недели(от 1 до 7 включительно:");
        var day = new Scanner(System.in).nextInt();
        //var day = 1;

        //processing
        String result;
        switch (day) {
            case 1: {
                result = "Monday";
                break;
            }
            case 2: {
                result = "Tuesday";
                break;
            }
            case 3: {
                result = "Wednesday";
                break;
            }
            case 4: {
                result = "Thursday";
                break;
            }
            case 5: {
                result = "Friday";
                break;
            }
            case 6: {
                result = "Saturday";
                break;
            }
            case 7: {
                result = "Sunday";
                break;
            }
            default: {
                result = "Unsupported operator: " + day;
                break;
            }
        }
        //display results
        System.out.println(result);
    }
}
