// Задание 2.Если необходимо, исправьте данный код 
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

public class ExcepDZ2_T2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Не задан массив
            double catchedRes1 = intArray[8] / intArray[d]; // Добавляем смысл в код, при делении на 0 код будет
            // только выдавать ошибку
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }

}