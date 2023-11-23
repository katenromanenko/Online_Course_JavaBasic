//Практика "Проверка високосного года"
// Реализовать программу LeapYear, которая проверяет
// введенный пользователем год
// на предмет является ли он високосным или нет.

package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //read source data
        //var year = 2019;
        System.out.println("Введите год:");
        var year = new Scanner(System.in).nextInt();


        //processing1
        boolean isLeap;
        // if ((year % 400) == 0) {
        //     isLeap = true;
        // } else if ((year % 100) == 0) {
        //     isLeap = false;
        // } else if ((year % 4) == 0) {
        //     isLeap = true;
        // } else {
        //     isLeap = false;
        // }

        //processing1
        if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))){
            isLeap = true;
        }else {
            isLeap = false;
        }

        //display results
        System.out.println(isLeap ? year + " is leap year" : year + " is not leap year");
    }
}
