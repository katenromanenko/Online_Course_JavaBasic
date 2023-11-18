//Реализовать программу SumFrom1To100,
// которая считает сумму чисел от 1 до 100 включительно используя циклы.
package academy.devonline.java.basic.section05_cycles;

class SumFrom1To100 {
    public static void main(String[] args) {
        //read source data
        var from = 1;
        var to = 100;

        //processing
        var sum = 0;
        for (var i = from; i <= to; i++) {
            sum +=  i;
        }

        //display results
        System.out.println(sum);
        }
    }

