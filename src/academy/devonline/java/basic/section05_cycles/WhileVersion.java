//Практика "Преобразование программ под использование цикла While"
// 1. Изменить программу DisplayNumbersFrom100To1,
// которая выводит на консоль все целые числа от 100 до 1 (включительно)
// так, чтобы, вместо цикла for использовался цикл while;
//
//2. Изменить программу DisplayEvenNumbersFrom0To50,
// которая выводит на консоль все четные целые числа от 0 до 50 (включительно)
// так, чтобы, вместо цикла for использовался цикл while;
package academy.devonline.java.basic.section05_cycles;

class WhileVersion {
    public static void main(String[] args) {
        // DisplayNumbersFrom100To1--------------------------------
        {
            //read source data
            var from = 100;
            var to = 1;
            var step = 1;

            //processing
            //display results
            int i = from;
            while(i >=to){
                System.out.print(i + " ");
                i= i - step;
            }
            System.out.println();
        }
        //DisplayEvenNumbersFrom0To50-------------------------------
        {
            //read source data
            var from = 0;
            var to = 50;
            var step = 2;

            //processing
            //display results
            int i = from;
            while(i <= to){
                System.out.print(i+" ");
                i += step;
            }
            System.out.println();
        }
    }
}
