package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Test {
    static public  void main(String args[]) {
        B b = new B();
        A a = b;
        if (a.hashCode() == b.hashCode())
            System.out.print("Passed"); //Passed
    }

    static class A {} // without static
    static class B extends A {} // without static
    //Пояснение: Ссылки a и b указывают на один и тот же объект, поэтому в консоль выведется строка "Passed".
    // Экземпляру класса a1 можно присвоить экземпляр класса B в силу полиморфизма.

// 2:
//    Выберите все верные варианты объявления метода main (java 5 и выше).
//  public static void main(String args[])
//  public static void main(String ... args)
//  public static void main(String[] args)
    /*Пояснение: Так как с 5 Java появился оператор ... то
    public static void main(String ... args) {...} также будет правильным вариантом.
*/
}
