//Тернарный оператор

package academy.devonline.java.basic.section04_conditional;

class TernaryOperator {
    public static void main(String[] args) {
        var a = 6;

        if(a == 5){
            System.out.println("a == 5");
        }else{
            System.out.println("a != 5");
        }

        //Тернарный оператор
        //(условие ? если условие истина : тогда условие ложь)
        System.out.println(a == 5 ? "a == 5" : "a != 5");
    }
}
