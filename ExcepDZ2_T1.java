/*Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.*/

import java.util.Scanner;

public class ExcepDZ2_T1 {
    public static void main(String[] args) {
        inputOnlyFloat();
    }

    private static float inputOnlyFloat() {
        Scanner sc = new Scanner(System.in);
        while (true) {
			System.out.print("Введите дробное число с точкой, тип данных - float : ");
            try {
                String flNumber = sc.nextLine();
                float flNum = Float.parseFloat(flNumber);
                System.out.printf("Всё верно, вы ввели дробное число  %s",  flNum);
                return flNum;                
            } catch (NumberFormatException e) {
                System.out.println("Неверный тип данных, повторите ввод!");
            }
            sc.close();
        }
    }
}