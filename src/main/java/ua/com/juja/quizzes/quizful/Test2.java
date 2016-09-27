package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
// Данный класс был запущен с ключом -ea. Какой результат выполнения данного кода
public class Test2 {
    static public  void main(String args[]) {
        Boolean b = true;
        int i = 10;
        String str = "Hello World";
        assert (b == true) : "true";
        assert (i != 10) : "false";
        System.out.println(str); // у меня - Hello World, но...
    //Пояснение: Ошибка времени выполнения.
//        Будет выброшено исключение AssertionError, потому что условие i != 10 будет ложным.
//        См. документацию http://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html

//        assert cond;
//        is equivalent to
//        if (!cond)
//            throw new AssertionError();
    }
}
