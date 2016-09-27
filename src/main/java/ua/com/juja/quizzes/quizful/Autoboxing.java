package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Autoboxing {
    public static void main(String[] args) {
        Integer oInt1 = null;
        Integer oInt2 = 0;
        final int int1 = oInt1; //NullPointerException
        final int int2 = oInt2;
        System.out.println(int1 == int2);
    }

    //    Пояснение: Возникнет java.lang.NullPointerException в 5-й строке, поскольку компилятор преобразует выражение
//    final int int1 = oInt1;
//    в
//    final int int1 = oInt1.intValue();
}
