package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/29/16.
 */
public class TestExceptions {
    public static void main(String[] args) {
        try {
            throw new UnsupportedOperationException();
        } catch(Throwable t) {
            System.out.print("1");
//        } catch(Exception e) {   // Код не скомпилируется
//            System.out.print("2");
//        } catch(UnsupportedOperationException uoe) { Код не скомпилируется
//            System.out.print("3");
        }
        /*Пояснение: Код не скомпилируется. Все исключения в java наследуются от Throwable.
        В нескольких блоках catch обработка исключений должна идти вверх по иерархии исключений
        (в данном случае от более конкретного - UnsupportedOperationException до более общего - Throwable, но не наоборот).*/
    }
}
