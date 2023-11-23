//Структура любой консольной программы
package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class StructureOfAnyConsoleProgram {
    public static void main(String[] args) {
        //read source data - чтение исходных данных
        //processing - обработка исходных данных
        //display results - отображение результата

        System.out.println("Please enter the number: ");
        var number =new Scanner(System.in).nextInt();

        var result = number + 1;

        System.out.println(result);
    }
}
