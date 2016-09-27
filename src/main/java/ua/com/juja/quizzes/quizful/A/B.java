package ua.com.juja.quizzes.quizful.A;

/**
 * Created by Serzh on 9/26/16.
 */
public class B extends A {
    public void process() throws RuntimeException {
        super.process();
        if (true) throw new RuntimeException();
        System.out.print("B ");
    }

    public static void main(String[] args) {
        try {
            ((A) new B()).process();
        } catch (Exception e) {
            System.out.print("Exception "); //A Exception
        }
    }
    /*Пояснение: Хотя при переопределении метода нельзя добавлять исключение,
    на RuntimeException (исключениe времени исполнения) это ограничениe не распространяется.*/
}
