package academy.devonline.java.basic.section03_expression;

public class RelationalExpressions {
    public static void main(String[] args) {
        var a = 2;
        var b = 5;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        System.out.println(a >= 8);

        var c1 = a==b;

        System.out.println(c1);
    }
}
