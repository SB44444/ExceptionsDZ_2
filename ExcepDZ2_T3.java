// Задание 3. Дан следующий код, исправьте его там, где требуется (задание 3 
// https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
// Исходный код
//    public static void main(String[] args) throws Exception {
//        try {
//            int a = 90;
//            int b = 3;
//            System.out.println(a / b);
//            printSum(23, 234);
//            int[] abc = {1, 2};
//            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        } catch (NullPointerException ex) {
//            System.out.println("Указатель не может указывать на null!");
//        } catch (IndexOutOfBoundsException ex) {
//            System.out.println("Массив выходит за пределы своего размера!");
//        }
//    }
//
//    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//        System.out.println(a + b);
//    }

public class ExcepDZ2_T3 {

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2, 9}; // Добавляем эл-т массива со значением 9 (если abc массив из трёх эл-тов)
            abc[2] = 9; // Меняем индекс эл-та массива, чтобы не выйти за пределы массива IndexOutOfBoundsException
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (Throwable ex) { // Если типичные исключения не отработали, ставим в край
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) { // Метод не использует загрузку из файла
        // ошибка FileNotFoundException не может появиться
        try {
            System.out.println(a + b);
        } catch (NumberFormatException e) { // Возможна ошибка ввода по типу данных, её обрабатываем
            System.out.println("Ошибка типа данных");
        }
    }

}
