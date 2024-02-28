//Пример_Вывод дня недели

package academy.devonline.java.basic.section06_array;

public class WeekDay {
    public static void main(String[] args) {


    //read sourse data
    var day = 50;

    //processing
    String[] days ={"Monday", "Tuesday", "Wednesday", "Friday", "Saturday", "Sunday"};
    var result = day >= 1 && day <= 7 ? days[day-1] : "Invalid day: "+day;

    //display results
        System.out.println(result);
    }
    }

