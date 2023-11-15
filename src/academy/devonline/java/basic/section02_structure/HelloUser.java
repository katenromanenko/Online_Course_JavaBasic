package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class HelloUser {
     public static void main(String[] args) {
          System.out.println("Напишите Ваше имя и нажмите enter");
          var name =  new Scanner(System.in ).nextLine();

          var result = "Hello, " + name;

          System.out.println(result);
     }

}
