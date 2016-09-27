package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class QTest {
    {
        System.out.print("1");
    }

    public static void main(String[] args) {
        System.out.print("2");
        new QTest();
    }

    static {
        System.out.print("3");
    }
    /*Пояснение: Статические блоки инициализации выполняются до вызова метода main
    и до создания первого экземпляра класса, в котором они объявлены.
    Нестатические блоки инициализации выполняются в момент создания экземпляра класса.
    Поэтому в данном примере сначала выполнится "System.out.print("3");",
    затем начнёт работу метод main - выполнится "System.out.print("2");",
    и наконец, при инстанцировании экземпляра класса QTest выполниться "System.out.print("1");".

Правильный ответ - "На консоль выведется 321".*/
}