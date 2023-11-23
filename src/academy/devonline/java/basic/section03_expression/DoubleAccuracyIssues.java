//Погрешности работы с числами с плавающей точкой
package academy.devonline.java.basic.section03_expression;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {
        {
            //Если необходимы точные данные, не использовать double
            var a = 2;
            var b = 1.1;
            var c = a - b;
            System.out.println(c); //0.8999999999999999
        }
        {
            //Лучше использовать классы
            BigDecimal a = new BigDecimal("2");
            BigDecimal b = new BigDecimal("1.1");
            BigDecimal c = a.subtract(b); //a - b
            System.out.println(c); //0.9
        }
        {
            //Не точное значение числа Pi
            System.out.println(22./7.); //3.142857142857143

            //Точное значение числа Pi

            //new BigDecimal("22") - создаю BigDecimal;
            //setScale(20) - устанавливаю, что нас интересует 20 символов после точки;
            //divide(new BigDecimal("7") - делю на 7;
            System.out.println(new BigDecimal("22").setScale(20).divide(new BigDecimal("7"), RoundingMode.HALF_UP));
            //3.14285714285714285714
        }
    }
}
