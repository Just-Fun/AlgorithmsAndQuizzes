package ua.com.juja.quizzes.quizful.singleton;

import java.text.NumberFormat;

/**
 * Created by Serzh on 9/26/16.
 */
public class Main3 {
    public static void main(String[] args) {
        float f = 123.45678f;
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        System.out.println(numberFormat.format(f)); // Программа выведет "123.46"
    }
}
