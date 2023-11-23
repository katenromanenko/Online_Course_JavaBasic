//Какой цикл выбрать

package academy.devonline.java.basic.section05_cycles;

import java.util.Iterator;
import java.util.List;

public class WhichCycleType {
    public static void main(String[] args) {
        //for
        for (int i = 0; i < 4; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        //while
        int j = 0;
        while (j < 5){
            System.out.print(j++ + " ");
        }
        System.out.println();

        //do while
        int k = 100;
        do {
            System.out.print(k-- + " ");
        }while (k < 4);
        System.out.println();

        //Which ?????????????????

        //Если есть некоторый счетчик, и
        // есть некоторое критическое значение этого счетчика -> for
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }

        //Если у вас в программе есть некоторый объект
        //который внутри себя уже содержит счетчик
        Iterator<Integer> iterator = List.of(1,2,3,4).iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        //do while
        //может вообще не использоваться
    }
}
