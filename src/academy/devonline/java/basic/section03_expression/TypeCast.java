//Преобразование типов
package academy.devonline.java.basic.section03_expression;

public class TypeCast {
    public static void main(String[] args) {
        //int, double, boolean, char, String

        //Преобразовать любой тип данных в String
        //необходимо использовать конструкцию String.valueOf(1)
        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        //В случае когда мы используем конкатенацию строк
        //и уже первым операндом есть строка, то
        //автоматическая Java умеет преобразовывать любой тип
        //данных в строку
        System.out.println("Hello " + 1 + 1.1 + true + 'a');

        //Преобразование из String в int
        int si = Integer.parseInt("12");

        //Преобразование из String в double
        double sd = Double.parseDouble("1.2");

        //Преобразование из String в boolean
        boolean sb = Boolean.parseBoolean("true");

        //Преобразование из String в char
        char ch1 = "a".charAt(0);
        char ch2 = "abc".charAt(1);
        System.out.println(ch2);

        //Кол-во байт на хранение этих типов
        char ch = 2;
        int i = 4;
        double d = 8;

        //Если размерность не увеличивается.
        //Расширяем область видимости.
        //Преобразование не надо.
        d = i;
        d = ch;
        i = ch;

        //Надо явно указать преобразование
        i = (int) d;
        ch = (char) d;
        ch = (char) i;

        //Особый тип boolean
        //Его нельзя привести не к какому типу
        //Только к String
        boolean b = true;
    }
}
