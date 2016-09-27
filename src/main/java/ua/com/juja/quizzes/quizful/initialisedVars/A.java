package ua.com.juja.quizzes.quizful.initialisedVars;

/**
 * Created by Serzh on 9/27/16.
 */
public class A {
    private int a;  //--1--

    public short getB() {
        short b;  //--2--
//        return b;  //--3-- ошибка компиляции в строке 3
        return 0; // just to compile...
    }

    public static void main(String[] args) {
        System.out.print(new A().a);  //--4--
        System.out.println(new A().getB());  //--5--
    }
    /*Пояснение: В строке 3 произойдёт ошибка компиляции из-за использования непроинициализированной локальной переменной b.
В строке 4 такой ошибки не будет, поскольку поле класса по умолчанию инициализируется нулём.*/
}
