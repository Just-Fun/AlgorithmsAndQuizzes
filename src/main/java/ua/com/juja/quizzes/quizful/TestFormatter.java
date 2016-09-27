package ua.com.juja.quizzes.quizful;

import java.util.*;
/**
 * Created by Serzh on 9/27/16.
 */
public class TestFormatter {
    public static void main(String... args){
        Integer I1 = 0;
        Integer I2 = -1;
        Integer I3 = 1;
        Formatter f = new Formatter();
        f.format("%1$b ", I1.toString())
                .format("%1$b ", I2.toString())
                .format("%1$b ", I3.toString());
        System.out.println(f.toString()); // true true true
    }
    /*Пояснение: Последовательность %b используется для вывода логического значения.
    Соответствующий аргумент обрабатывается следующим образом:
- если передаётся булево значение, то результатом будет его строковое представление ("true" или "false");
- если передаётся null, то результатом будет "false";
- во всех остальных случаях (как и в данном примере) результатом будет "true".*/
}
