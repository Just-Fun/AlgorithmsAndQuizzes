package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        double c = (double) (a / b);
        String str = String.format("%1.4f", c);
        System.out.println(str); //0.0000
// Пояснение: В данном случае результат деления 2-ух целых чисел будет также округляться до целого,
// а затем приводиться к double (т. о. получаем 0).
// Чтобы на консоль вывелось 0,1000 необходимо изменить строку double c = (double) (a/b) на double c = (double) a/b.
    }
}
