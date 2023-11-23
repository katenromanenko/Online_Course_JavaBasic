//Логические выражения

package academy.devonline.java.basic.section03_expression;

public class LogicExpressions {
    public static void main(String[] args) {
        //статические литералы
        var a = true;
        var b = false;

        //выражения
        var c = 2 > 1;
        var d = 2 == 1;

        //логический операнд НЕ
        System.out.println(!a);
        System.out.println(!b);

        //логический операнд И
        System.out.println(a && b);

        //логический операнд ИЛИ
        System.out.println(a || b);
        {
            //таблица истинности
            System.out.println("--------------- && ---------------");
            System.out.println("true \t && \t true \t = \t" + (true && true));
            System.out.println("true \t && \t false \t = \t" + (true && false));
            System.out.println("false \t && \t true \t = \t" + (false && true));
            System.out.println("false \t && \t false \t = \t" + (false && false));
        }
        {
            System.out.println("--------------- || ---------------");
            System.out.println("true \t || \t true \t = \t" + (true || true));
            System.out.println("true \t || \t false \t = \t" + (true || false));
            System.out.println("false \t || \t true \t = \t" + (false || true));
            System.out.println("false \t || \t false \t = \t" + (false || false));
        }
    }
}
