//Понятие переменной
package academy.devonline.java.basic.section02_structure;

public class Var {
    public static void main(String[] args) {
        //Переменная - это некоторая ячейка памяти, куда можно записать
        //некоторое значение и после того как это значение
        //будет записана в эту переменную, эту переменную можно передать
        //в результат, чтобы вывести ее значение.
        var text = "Hello World";  //статическое значение
        System.out.println(text);

        text = "I love Java";      //статическое значение
        System.out.println(text);

        text = "Hello " + System.getProperty("user.name");  //динамическое значение
        //System.getProperty("user.name") - текущие имя пользователя на данном компьютере
        System.out.println(text);
    }
}
