/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя!!!*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExcepDZ2_T4 {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст, пустую строку вводить нельзя!!!");
        try{
            String line = in.readLine();
            if(line.equals("")) throw new RuntimeException("Пустую строку вводить нельзя!!!");
            System.out.printf("Ваш текст: %s", line);
        } catch (IOException e) {throw new RuntimeException (e);
    }
}
}
