package ua.com.juja.quizzes.quizful.a2;

/**
 * Created by Serzh on 9/27/16.
 */
public class MainClass {
    public static void main(String args[]) {
        A a = new B();
        a.m(5.0); // class A, method m : 1
    }

    static class A {
        public void m(Number n) {
            n = 5 / 3;
            System.out.println("class A, method m : " + n);
        }
    }

    static class B extends A {
        public void m(Double d) {
            d = d / 3;
            System.out.println("class B, method m : " + d);
        }
    }
    /*Пояснение:

Пояснение: полиморфного вызова методов не происходит, поскольку сигнатуры void m(Number n) и
void m(Double d) отличаются. Тот факт, что Double наследник Number не играет никакой роли.

Переменная a имеет тип A. Поэтому по a.m() может вызываться только метод, который присутствует в классе A
(или, конечно, его перекрытый вариант из B). В классе A есть только один метод с именем m.
Поэтому, если и будет вызываться, то только метод с сигнатурой m(Number).
Теперь посмотрим на класс B. Тут тоже есть метод с именем m, но у него другой (!) набор параметров.
Следовательно, он не перекрывает (override) исходный метод.
Получается, что в этом примере может быть вызван только метод A.m(Number).
Осталось проверить, что в этот метод можно передать наш параметр (не будет ли где-нибудь ошибки компиляции?)
и рассчитать, сколько будет 5/3.*/
}
