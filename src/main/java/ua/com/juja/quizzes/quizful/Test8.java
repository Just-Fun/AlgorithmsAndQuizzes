package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/27/16.
 */
public class Test8 {
    public static void main(String[] args) {
        boolean b = true;
        int x = 0;

        do {
            if (x++ > 5)
                b = false;
            System.out.print(x); // 1234567
        } while (b);
    }
}
