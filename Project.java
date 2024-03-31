import java.util.Arrays;

public class Project {
    public static void main(String[] args) {
        String[] inputArray = { "apple", "ban", "oe", "ш", "pear", "grape" };
        String[] resultArray = filterShortStrings(inputArray);

        System.out.println("Исходный массив: " + Arrays.toString(inputArray));
        System.out.println("Новый массив: " + Arrays.toString(resultArray));
    }

    public static String[] filterShortStrings(String[] inputArray) {

        // Создаем новый массив такого же размера, как исходный
        String[] resultArray = new String[inputArray.length];

        int index = 0;

        // Перебираем элементы исходного массива
        for (String str : inputArray) {
            // Проверяем длину текущей строки
            if (str.length() <= 3) {
                // Если длина подходит, добавляем строку в новый массив
                resultArray[index++] = str; // операция инкремента. Переменная index увеличивается на 1 после того, как
                                            // ее текущее значение используется.
            }
        }

        // Обрезаем массив до фактического размера
        return Arrays.copyOf(resultArray, index);
    }
}