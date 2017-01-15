package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/29/16.
 */
//Какие из приведенных выражений будут истинными при выполнении кода:
//(a == "hello")
// (a == b)
// (a == c) -> !!!
// a.equals(b) -> !!!
// a.equals(d)
public class EqualsStrings {
    public static void main(String[] args) {
        String a = new String("hello");
        String b = new String(a);
        String c = a;
        char[] d = { 'h', 'e', 'l', 'l', 'o' };
    }
}
