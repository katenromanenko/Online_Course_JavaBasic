//Практика "Универсальный вывод дня недели"
// Реализовать программу UniversalWeekDay,
// которая запрашивает номер дня недели (от 1 до 7 включительно),
// а также логический параметр isMondayFirst и затем выводит названия
// дня недели с учетом культурных или религиозных особенностей.
// Если isMondayFirst=true, то тогда первым днем недели считается понедельник,
// если isMondayFirst=false, то тогда первым днем недели считается воскресенье.

package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

class UniversalWeekDay {
    public static void main(String[] args) {
        //read source data
        System.out.println("Введите номер дня недели:");
        var day = new Scanner(System.in).nextInt();
        System.out.println("Введите true - если 1 - понедельник, false - если 1 - воскресенье:");
        var isMondayFirst =  new Scanner(System.in ).nextBoolean();


        //processing
        var internalDay = day;
        if(!isMondayFirst){
            internalDay--;
            if (internalDay==0){
                internalDay = 7;
            }
        }

        String result;
        if (internalDay == 1){
            result = "Monday";
        }else if (internalDay == 2){
            result = "Tuesday";
        }else if (internalDay == 3) {
            result = "Wednesday";
        }else if (internalDay == 4) {
            result = "Thursday";
        }else if (internalDay == 5) {
            result = "Friday";
        }else if (internalDay == 6) {
            result = "Saturday";
        }else if (internalDay == 7) {
            result = "Sunday";
        }else{
            result = "Unsupported operator: " + day;
        }
        //display results
        System.out.println(result);
    }
}
