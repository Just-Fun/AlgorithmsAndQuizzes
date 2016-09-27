package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Test6 {
    public static void main(String[] args){
        int x = 1;
        Integer y = new Integer(x);
        int [] z = {x};

        func(x, y, z);

        System.out.print(x);      // 1
        System.out.print(y);      // 1
        System.out.println(z[0]); // 2
    }

    static void func (int x, Integer y, int[] z) {
        x++;
        y++;
        z[0]++;
    }
    /*Пояснение:

Так как передача параметров в метод осуществляется по значению, то:
- переменная x хранит то же самое число;
- переменная y ссылается на тот же самый объект;
- переменная z ссылается на тот же самый массив, что и внешние переменные.

Изменение значения x не влияет на значение внешней переменной.
Объекты типа Integer являются неизменяемыми (immutable),
поэтому после операции y++ переменная y будет ссылаться на новый объект (с увеличенным значением),
а исходный объект останется нетронутым.
Ссылка на массив позволяет свободно изменять значения элементов массива.*/
}
