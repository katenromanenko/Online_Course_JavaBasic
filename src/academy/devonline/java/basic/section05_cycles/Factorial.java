//Практика "Вычисление факториала"
// Реализовать программу Factorial,
// которая рассчитывает факториал числа.
package academy.devonline.java.basic.section05_cycles;

public class Factorial {
    public static void main(String[] args) {
        //read source data
        int value = 5;   //исходные данные

        //processing
        String finalResult; //отдельная переменная результата
        if (value < 0){     //первая проверка, если наше число меньше 0, значит факториал посчитать невозможно
            finalResult = "Value should be >=0";
        } else {
                var result = 1; //переменная результата, которая последовательно будет перемножать числа
                for (var i = 1; i <= value; i++ ){
                    var oldResult = result;  //для проверки переполнения
                    result *= i;    //считаем факториал
                    if (oldResult != result / i){ //для проверки переполнения
                        result = 0;
                        break;
                    }
                }
                //если ноль, то переполнено, иначе приводим результат к типу String
                finalResult = result == 0 ? "Int overflow": String.valueOf(result);
        }
        //display results
        System.out.println(finalResult);
    }
}
