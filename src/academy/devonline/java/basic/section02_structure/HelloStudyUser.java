////Практика "Изменение программы приветствия"
// Создать программу HelloStudyUser,
// которая считывает имя пользователя с переменной name,
// вместо использования считывания с консоли,
// а затем выводит на консоль фразу: Hello, ${name},
// где ${name} - это то имя, которое задано в переменной name.
package academy.devonline.java.basic.section02_structure;

public class HelloStudyUser {
    public static void main(String[] args) {
        var name = "Kate";

        String result = "Hello, " + name;

        System.out.println(result);
    }
}
