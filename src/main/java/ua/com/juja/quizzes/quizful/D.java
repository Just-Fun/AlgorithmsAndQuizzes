package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class D {
    public static void main(String[] args) {
        E e = new E();
        e.someVariable = 100;
        e.doIt(e);
        System.out.println(e.someVariable); // 101
    }
}

class E {
    public int someVariable = 10;

    public void doIt(E aE) {
        aE.someVariable++;
    }

    E() {
    }
}
