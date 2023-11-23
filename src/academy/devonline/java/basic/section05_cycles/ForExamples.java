//Цикл For - Вариации

package academy.devonline.java.basic.section05_cycles;

public class ForExamples {
    public static void main(String[] args) {
        //от 1 до 5
        for (int i = 0; i < 5; i++){
            System.out.print(i+1+" ");
        }
        System.out.println();

        //от 5 до 1
        for (int i = 4; i >= 0; i--){
            System.out.print(i+1 +" ");
        }
        System.out.println();

        //наоборот вывод
        for (int i = 0; i < 5; i++){ //i = i + 1
            System.out.print(5-i +" ");
        }
        System.out.println();

        //от 50 до 100, с шагом 5
        for (int i = 50; i <= 100; i+=5){  //i = i + 5
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
