package ua.com.juja.quizzes.quizful;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

/**
 * Created by Serzh on 9/26/16.
 */
/*Что нужно вставить вместо ... чтобы прочитать строку "Reading successful." из файла C:\file.txt
и вывести её на экран (укажите все подходящие варианты)?*/
public class ReadFromFile {
    public static void main(String[] args) {
        File file = new File("C:\\file.txt");
        try {
            //...
            BufferedReader input = new BufferedReader(new FileReader(file)); // 1.
//          FileInputStream input = new FileInputStream(file); // 2.
            int i;
            while((i = input.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (Exception ex) {
            System.out.println("Exception");
        }
    }
}
