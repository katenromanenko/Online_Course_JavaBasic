package academy.devonline.java.basic.section03_expression;

public class SwapVariables {
    public static void main(String[] args) {
        //read source data
        var a = 2;
        var b = 5;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //processing
        var temp = a;
        a = b;
        b = temp;

        //display results
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
