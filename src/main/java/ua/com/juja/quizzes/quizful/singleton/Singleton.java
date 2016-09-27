package ua.com.juja.quizzes.quizful.singleton;

/**
 * Created by Serzh on 9/26/16.
 */
public class Singleton {
    private static Singleton s = new Singleton();
    protected Singleton() {
        System.out.println("S");
    }
    public static Singleton getInstance() {
        return s;
    }
}
