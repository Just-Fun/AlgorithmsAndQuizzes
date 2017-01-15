package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/29/16.
 */
public class IntegerEqualsInt {
    public static void main(String[] args) {
        int i = 1000;
        Integer x = new Integer(1000);
        if(x == i) {
            System.out.print("true"); // -> !!!
        } else {
            System.out.print("false");
        }
    }
    /*Пояснение: При компиляции, компилятор добавит к выражению сравнения intValue(), т.е получится x.intValue() == i*/
}
