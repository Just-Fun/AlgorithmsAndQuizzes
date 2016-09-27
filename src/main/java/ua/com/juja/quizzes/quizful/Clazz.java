package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Clazz {
    private void process(String... s) {
        System.out.print("*");
    }
    private void process(String s) {
        System.out.print("1");
    }
    private void process(String s, String a) {
        System.out.print("2");
    }
    public static void main(String[] args) {
        Clazz c = new Clazz();
        c.process("asd"); // 1
        c.process("asd","asd"); // 2
        c.process("asd","asd","asd"); // *
    }
    /*Пояснение: Компилятор анализирует методы с vararg-параметрами в последнюю очередь,
    только если никакие другие методы не подошли.
    Поэтому вызовы process("asd") и process("asd","asd") будут откомпилированы без ошибок.*/
}
