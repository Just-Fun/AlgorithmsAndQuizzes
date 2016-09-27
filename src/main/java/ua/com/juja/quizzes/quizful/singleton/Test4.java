package ua.com.juja.quizzes.quizful.singleton;

import ua.com.juja.quizzes.quizful.Test;

/**
 * Created by Serzh on 9/26/16.
 */
public class Test4 {
    public void method() {
        Singleton.getInstance();
    }
    public static void main(String [] str) {
        new Test();
    }
    /*Ничего не будет выведено. 6534 / 12469
Пояснение:

Инициализация статических полей осуществляется при инициализации класса.
Инициализация класса, в свою очередь, выполняется при первом обращении к классу
(создание экземпляра класса, обращение к статическому полю или методу и т.д.)*/
}
