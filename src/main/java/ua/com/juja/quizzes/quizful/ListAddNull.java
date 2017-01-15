package ua.com.juja.quizzes.quizful;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Serzh on 9/29/16.
 */
//Какой будет результат компиляции и выполнения следующей программы?
public class ListAddNull {
    public static void main(String a[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(null);
        list.add(null);
        for (Integer i : list) {
            System.out.println(i);
        }
//        print:
//        null
//        null
    }
}
