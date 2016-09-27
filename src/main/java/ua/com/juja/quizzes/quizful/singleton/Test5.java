package ua.com.juja.quizzes.quizful.singleton;

/**
 * Created by Serzh on 9/26/16.
 */
public class Test5 {
    int i = 1;

    void add(int i) {
        i += i;
        System.out.println(i);
    }

    public static void main(String args[]) {
        Test5 t = new Test5();
        t.add(5); // 10
    }
    /*Пояснение: Внутри метода add мы работаем только с параметром метода i,
    так как для обращения к переменной класса i (особенно в данном случае совпадения имен)
    необходимо употребить ключевое слово this.*/
}
