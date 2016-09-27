package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Test4 {
    private String name;

    Test4(String name) {
        this.name =  name;
    }

    public void test(final Test4 test) {
//        test = new Test4("three");
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Test4 t1 = new Test4("one");
        Test4 t2 = new Test4("two");
        t1.test(t2);
        System.out.println(t2);
    }
/*Пояснение: final параметр в методе test, говорит о том что ссылка на объект test не может быть изменена,
поэтому строка test = new Test("three") приведёт к ошибке на этапе компиляции.*/
}
