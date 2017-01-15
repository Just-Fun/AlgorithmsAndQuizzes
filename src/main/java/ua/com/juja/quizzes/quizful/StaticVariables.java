package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/29/16.
 */
public class StaticVariables {
    public static StaticVariables instance = new StaticVariables();
    private static final int DELTA = 5;
    private static int BASE = 7;
    private int x;

    public StaticVariables() {
        x = BASE + DELTA;
    }

    public static void main(String[] args) {
        System.out.println(StaticVariables.instance.x); //5
    }
    /*Пояснение: Инициализация статических полей осуществляется в том порядке, в котором они записаны.
В этом примере первым будет проинициализировано поле instance, а уже затем - BASE.
Поэтому в момент вызова конструктора Tasks() поле BASE ещё содержит 0.
Поле DELTA является переменной-константой, поэтому компилятор сразу подставляет в выражение вместо DELTA его значение.
В итоге получаем: x = 0 + 5;*/
}
