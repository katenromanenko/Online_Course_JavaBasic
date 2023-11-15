package academy.devonline.java.basic.section03_expression;

public class IntOverflow {
    public static void main(String[] args) {
        {
            var i = Integer.MAX_VALUE;
            System.out.println(i + 1);
        }
        {
            var i = Integer.MIN_VALUE;
            System.out.println(i - 1);
        }
    }
}
