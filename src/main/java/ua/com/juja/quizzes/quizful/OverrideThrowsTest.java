package ua.com.juja.quizzes.quizful;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Serzh on 9/26/16.
 */
/*Выберите все правильные ответы, при которых код скомпилируется, если вставить их в строку 1:*/
public class OverrideThrowsTest {
    public static void main(String[] args)
    // 1
            throws IOException // or throws Exception
    {
        A1 a = new A1();
        a.method();
        A1 ab = new B();
        ab.method();
        B b = new B();
        b.method();
    }
}

class A1 {
    public void method() throws IOException {}
}

class B extends A1 {
    public void method() throws FileNotFoundException {}
}
