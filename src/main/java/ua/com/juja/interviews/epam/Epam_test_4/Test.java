package ua.com.juja.interviews.epam.Epam_test_4;

/**
 * Created by serzh on 4/15/16.
 */
//#7
public class Test {

  /*  public static void main(String[] args) {
        B b = new B(); // не компилится, can not be referenced from a static context
        a1 a = b;
    }

    class a1 {
    }

    class B extends a1 {
    }*/

    // как можно реализовать

    /*public static void main(String[] args) {
        B b = new B();
        a1 a = b;
        System.out.println(a.hashCode()); // 2125039532
        System.out.println(b.hashCode()); // 2125039532
        if (a.hashCode() == b.hashCode()) {
            System.out.println("Passed"); // Passed
        }
    }
    static class a1{}
    static class B extends a1 {}*/
}
