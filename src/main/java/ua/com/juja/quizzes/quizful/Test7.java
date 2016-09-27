package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Test7 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 4 ; ) {
            switch(new Integer(i++)) {
                case 1:
                    System.out.print("one ");
                    break;
                case 3:
                    System.out.print("three ");
                case 4:
                    System.out.print("four ");
                default:
                    System.out.print("def ");
            }
        } // def one def three four def
        /*Пояснение:

Выполняется четыре итерации цикла:
при i = 0 выводится def
при i = 1 выводится one
при i = 2 выводится def
при i = 3 выводится three four def

Из-за постфиксной формы записи i++ в switch проверяется исходное значение, а отсутствие break в ветках для case 3,
 case 4 приводит к тому, что они выполняются без остановки.*/
    }
}
