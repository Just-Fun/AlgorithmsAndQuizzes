package ua.com.juja.quizzes.quizful;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Serzh on 9/29/16.
 */
// 0
// 3
// Произойдет ошибка компиляции 4284 / 21494
// Произойдет ошибка времени выполнения  -> !!!
public class ArraysAsList {
    public static void main(String[] args) {
        String[] str = new String[] { "1", "2", "3" };

        List list = Arrays.asList(str);
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            Object object = (Object) iterator.next();
            iterator.remove(); // UnsupportedOperationException
        }
        System.out.println(list.size());
    }
    /*Пояснение: Метод Arrays.asList() возвращает неизменяемый список – т.е. список,
    в который нельзя добавить или из которого нельзя удалить элементы.
Для этого используется внутренняя реализация списка,
в которой методы для добавления или удаления элементов выбрасывают UnsupportedOperationException:

public Object remove(int i) {
  throw new UnsupportedOperationException();
}
*/
}
