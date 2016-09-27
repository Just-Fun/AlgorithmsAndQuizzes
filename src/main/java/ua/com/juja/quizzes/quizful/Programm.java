package ua.com.juja.quizzes.quizful;

/**
 * Created by Serzh on 9/26/16.
 */
public class Programm {
    public static final int N = 5;

    public static void main(String[] args) {
        int m[][][] = new int[N][N][N];
        label:
        for (int i = 0; i <N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++) {
                    m[j][j][k] = i*j*k;
                    if (m[j][j][k] == 9) {
                        System.out.print(9);
//                        goto label; // Ошибка компиляции ->  break || continue label;
// Пояснение: Java не содержит оператора goto. Для успешной компиляции необходимо заменить goto на оператор break.
                    }
                }

    }
}
