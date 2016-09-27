package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class MainClass {
    public static void main(String args[]) {
        int k = 2;
        int m = 10;
        int s =  1 >> k++ + ++m - --k - m-- << 1;
        System.out.println("s = " + s); // s = 2
        System.out.println("k = " + k); // k = 2
        System.out.println("m = " + m); // m = 10
    }
    /*int s = 1 >> 2 + 11 - 2 - 11 << 1;
    ===
    int s = 1 >> 0 << 1;
    ===
    int s = (1 >> 0) << 1;
    ===
    int s = 1 << 1;
    ===
    int s = 2;
    У сдвига приотитет ниже чем у арифметических операций*/
}
