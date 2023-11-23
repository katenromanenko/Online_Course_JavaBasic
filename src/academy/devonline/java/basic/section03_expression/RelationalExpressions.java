//Операции сравнения

package academy.devonline.java.basic.section03_expression;

public class RelationalExpressions {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;

        //сравнение по равно — сравнить две переменные и если они одинаковые отразить true, неравны false.
        System.out.println(a == b);

        //сравнение не равно
        System.out.println(a != b);

        //а больше b
        System.out.println(a > b);

        //а больше или равно b
        System.out.println(a >= b);

        //а меньше b
        System.out.println(a < b);

        //а меньше или равно b
        System.out.println(a <= b);

        System.out.println(a >= 8);

        //Результат сравнения может быть помещен в переменную.
        var c1 = a==b;
        System.out.println(c1);
    }
}
