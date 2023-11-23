//Цикл бесконечный или долго выполняется операция
//Необходимо добавить контрольные точки
package academy.devonline.java.basic.section05_cycles;

import java.util.logging.SocketHandler;

public class InfiniteOrLongCycle {
    public static void main(String[] args) {
        //сохраняем время перед вычислением этого кода
        long time = System.nanoTime();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            //сохраняем время после вычисления
            System.currentTimeMillis();
            //Каждую миллионную итерацию будет появляться смс
            if (i%1_000_000 == 0){
                System.out.println(i);
            }
        }
        //отнимаем время после от до
        long result = System.nanoTime() - time;
        //преобразуем результат из наносекунд в секунды
        System.out.println((double)result / 1_000_000_000 + " seconds");
    }
}
