package ua.com.juja.quizzes.quizful;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Serzh on 9/27/16.
 */
public class NewClassSerializablewriteObject {

    public static void main(String[] args) throws Exception {
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        ObjectOutputStream oOut = new ObjectOutputStream(bOut);
        Whole object = new Whole();
        oOut.writeObject(object);
    }
}

class Whole implements Serializable {
    public void writeObject(ObjectOutputStream out) {
//    private void writeObject(ObjectOutputStream out) { - а так выведеться
        System.out.println("Whole.writeObject()");
    }
    /*Программа выполнится без ошибок и ничего не появится...

    Самое интересное, что если модификатор метода writeObject() класса Whole поменять на private строка выведется.
    Я если честно до этого не знал, что модификатор имеет значение,
    но сейчас глянул и действительно Object*Stream берут именно только private writeObject() и readObject() методы.

    По умолчанию класс ObjectOutputStream использует стандартный алгоритм для сохранения значений полей сериализуемого объекта.
Если в классе имеется специальный метод, сигнатура которого в точности соответствует
private void writeObject(java.io.ObjectOutputStream stream);
то он и будет вызван для сохранения значений вместо стандартного алгоритма.
А если использовать другой модификатор, как это сделано в примере, то ничего подобного не происходит.
    */
}
