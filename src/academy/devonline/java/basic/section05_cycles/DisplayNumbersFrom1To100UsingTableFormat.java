//Поэтапный подход в решении сложной задачи

package academy.devonline.java.basic.section05_cycles;

public class DisplayNumbersFrom1To100UsingTableFormat {
    public static void main(String[] args) {
        //read source data
        var from = 1;
        var to = 100;
        var step = 1;
        var cols = 10;

        //processing
        //display results
        for (int i = from; i <= to; i += step){
            System.out.print(i+"\t");
            if(i % cols == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
