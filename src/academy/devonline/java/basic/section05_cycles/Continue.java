//031 Оператор continue и рекомендации по его использованию

package academy.devonline.java.basic.section05_cycles;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //пропускается что идет после оператора continue
            //используется очень редко
            if(i>=3 && i<=6){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        //Without continue, инвертированная версия
        for (int i = 0; i < 10; i++) {
            if(i<3 || i>6){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
