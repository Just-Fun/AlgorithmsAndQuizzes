package ua.com.juja.quizzes;

/**
 * Created by Serzh on 9/25/16.
 */
public class Temp {
    final static int i;
    static {
        i = 8;
    }

    public Temp() {
    }

    private String name;

    Temp(String name) {
        this.name = name;
    }

    public void test(Temp test) {
        test = new Temp("three");
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Temp t1 = new Temp("one");
        Temp t2 = new Temp("two");
        t1.test(t2);
        System.out.println(t2);
    }
    /*Пояснение: Ссылки в метод передаются по значению и изменять их переназначая на новые объекты нельзя.*/
}
