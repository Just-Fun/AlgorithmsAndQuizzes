package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Main3 {
    public final static int EASY = 5;
    public static void main(String[] args) {
        int a = 5;
        test(++a);
    }

    static void test(int a) {
        a += EASY + a++;
        System.out.println(a); // 17
    }
}
