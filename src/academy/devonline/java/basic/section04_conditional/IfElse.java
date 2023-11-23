//Операция условного перехода

package academy.devonline.java.basic.section04_conditional;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //var a = new Scanner(System.in).nextInt();
        //var b = new Scanner(System.in).nextInt();
        var a = 5;
        var b = 8;

        //если-------------------------------------
        if(a > b){
            var result = "a > b";
            System.out.println(result);
        }

        //если, иначе-------------------------------
        if(a > b){
            System.out.println("a > b");
        }else {
            System.out.println("a <= b");
        }

        //вложеннные: если, иначе, если, иначе-------
        if(a > b){
            System.out.println("a > b");
        }else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
        }
        System.out.println("after");

            //упрощенная: если, иначе, иначе
            if(a > b){
                System.out.println("a > b");
            }else if(a < b ){
                    System.out.println("a < b");
                }else{
                    System.out.println("a = b");
                }

            //можно использовать переменные логического типа
        boolean condition = a > b;
            if(condition){
                System.out.println("condition = true");
            }

            //можно использовать сложные выражения
        if(condition || a < b && a > 1 || !(b < 7)){
            System.out.println("Complex condition example");
        }
        }
    }

