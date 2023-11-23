//Цикл While

package academy.devonline.java.basic.section05_cycles;

public class While {
    public static void main(String[] args) {
        //classic for----------------------------------------
        for (int i = 0; i < 5; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        {//for без инициализации-----------------------------
            int i = 0;
            for (;i < 5;){
                System.out.print(i++ +" ");
            }
            System.out.println();
        }
        {//while---------------------------------------------
            int i = 0;
            while (i < 5){
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
    }
}
