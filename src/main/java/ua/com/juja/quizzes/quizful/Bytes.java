package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Bytes {
    public static void main(String[] args) {
        byte b1 = 127;
        b1 +=1;
        System.out.println(b1); // -128
    }
    /*127 - это максимальное значение для переменной типа byte. Число 128 уже не входит в диапазон значений,
    но, благодаря использованию дополнительного кода для представления отрицательных чисел, оно рассматривается как -128.

    Такой же результат получается при преобразовании (byte)128.*/
}
