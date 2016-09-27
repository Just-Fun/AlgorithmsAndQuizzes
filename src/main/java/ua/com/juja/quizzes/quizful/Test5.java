package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Test5 {
    public static void main(String[] args) {
        MyLink b1 = new MyLink();
        MyLink b2 = b1;
        b2.str = "My String";
        System.out.println(b1.str); // My String

        String a1 = "Test";
        String a2 = a1;
        System.out.println(a2); // Test
        a1 = "Not a Test";
        System.out.println(a2); // Test
    }

    static class MyLink {
        public MyLink() {
            str = "New";
        }
        public String str;
    }
}
