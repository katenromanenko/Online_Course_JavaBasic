//1. Изменить программу DisplayNumbersFrom100To1,
// которая выводит на консоль все целые числа от 100 до 1 (включительно)
// так, чтобы, вместо цикла while использовался цикл do while;
//
//2. Изменить программу DisplayEvenNumbersFrom0To50,
// которая выводит на консоль все четные целые числа от 0 до 50 (включительно)
// так, чтобы, вместо цикла while использовался цикл do while;
package academy.devonline.java.basic.section05_cycles;

class DoWhileVersion {
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
            do {
                System.out.print(i + " ");
                i= i - step;
            }while(i >=to);
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
            do{
                System.out.print(i+" ");
                i += step;
            }while(i <= to);
            System.out.println();
        }
    }
}
