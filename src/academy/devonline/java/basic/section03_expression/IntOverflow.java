//Особенности кодирования чисел. Переполнение разрядов.
package academy.devonline.java.basic.section03_expression;

public class IntOverflow {
    public static void main(String[] args) {
        {
            //Записываем максимальное значение int
            var i = Integer.MAX_VALUE;
            System.out.println(i + 1); //получим отрицательное значение
        }
        {
            //Записываем минимальное значение int
            var i = Integer.MIN_VALUE; //получим положительное значение
            System.out.println(i - 1);

            //В Java используется особенности кодирования чисел,
            //и в случае, когда выполняется переполнение разряда,
            //когда мы в переменную пытаемся записать значение которое
            //больше возможного, у нас возникают вот такие коллизии.
            //Это связано с тем что первый разряд, при кодировании чисел,
            //не является значимым разрядом, а хранит знак.
            // 0+, 1-.

            System.out.println(1);
            System.out.println(1*2);
            System.out.println(1*2*3);
            System.out.println(1*2*3*4);
            System.out.println(1*2*3*4*5);
            System.out.println(1*2*3*4*5*6);
            System.out.println(1*2*3*4*5*6*7);
            System.out.println(1*2*3*4*5*6*7*8);
            System.out.println(1*2*3*4*5*6*7*8*9);
            System.out.println(1*2*3*4*5*6*7*8*9*10);
            System.out.println(1*2*3*4*5*6*7*8*9*10*11);
            System.out.println(1*2*3*4*5*6*7*8*9*10*11*12);
            System.out.println(1*2*3*4*5*6*7*8*9*10*11*12*13);

            System.out.println(1*2*3*4*5*6*7*8*9*10*11*12*13*2);

            System.out.println(1*2*3*4*5*6*7*8*9*10*11*12*13*14);
        }
    }
}
