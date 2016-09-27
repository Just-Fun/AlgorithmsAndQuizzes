package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class StaticBlocks {
    static { i = 5; }
    static int i = 6;

    public static void main(String[] args) {
        System.out.println(i); // 6
    }
    /*Пояснение: Блоки статической инициализации и инициализация статических переменных выполняются в том же порядке,
    в котором они идут в тексте класса. Поэтому первой будет выполнена команда i=5, а затем i=6.*/
}
