//Использование константных значений, вместо считывания с консоли

package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class StructureOfAnyStudyConsoleProgram {
    public static void main(String[] args) {
        //При разработке программы, использовать константные значения
        var a = 2; //new Scanner(System.in).nextInt();
        var b = 3; //new Scanner(System.in).nextInt();

        var result = a + b * ((5 - 7) * a);

        System.out.println(result);
    }
}
