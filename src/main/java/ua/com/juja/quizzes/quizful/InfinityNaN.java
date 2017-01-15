package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/29/16.
 */
public class InfinityNaN {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(-2.0)); // NaN
        System.out.println(1.0 / 0.0); // Infinity
    }
    /* public static double sqrt(double a) - If the argument is NaN or less than zero, the result is NaN.*/
}
