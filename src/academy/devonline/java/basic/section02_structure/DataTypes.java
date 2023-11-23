//Основные типы данных
package academy.devonline.java.basic.section02_structure;

public class DataTypes {
    public static void main(String[] args) {
        //Java - язык, со статической типизацией,
        //это означает, что когда мы создаем переменную
        //обязательно необходимо указать ее тип.

        //Целое число
        int i = 0;
        System.out.println(Integer.MIN_VALUE + " < " + i + " < " + Integer.MAX_VALUE);

        //Числа с плавающей точкой
        double d = 0.1;
        System.out.println(Double.MIN_VALUE + " < " + d + " < " + Double.MAX_VALUE);

        //Логический тип
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);


        //Символьный тип
        char ch = 'a';
        System.out.println(Character.MIN_VALUE + " < " + ch + " ( " + (int) ch + " )  < " + Character.MAX_VALUE);

        String s = "Hello World";
        System.out.println(s);
    }
}
