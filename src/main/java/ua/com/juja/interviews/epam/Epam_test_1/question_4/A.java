package ua.com.juja.interviews.epam.Epam_test_1.question_4;

/**
 * Created by Serzh on 9/27/16.
 */
//Какие из следующих утверждений верны? (выберите несколько):
//компилятор пытается создать по умолчанию конструктор для класса А -> !!!
//компилятор пытается создать по умолчанию конструктор для класса В -> ? -> не по умолчанию, а совпадающий с a1
//ошибка во время компиляции в строке  -> !!!
public class A {
    A(int i) { } //1

//    class B extends a1 { //ошибка во время компиляции в строке (требует конструктор, mathing super или по умолчанию конструктор для класса А)

//    }
}
