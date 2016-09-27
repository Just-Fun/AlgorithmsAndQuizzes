package ua.com.juja.quizzes.quizful.staticFields;

/**
 * Created by Serzh on 9/27/16.
 */
public class StaticFields {
    public static void main(String[] args) {
        System.out.print(A.i); // 1
        System.out.print(B.i); // 2
    }
}
/*Пояснение: Инициализация всех статических полей и блоки статической инициализации выполняются друг за другом,
в том порядке, в котором они записаны.
Поэтому в классе A поле i будет иметь значение 1, а в классе B — 2.*/

class A {
    static {
        i = 2;
    }

    static int i = 1;
};

class B {
    static int i = 1;

    static {
        i = 2;
    }
};
