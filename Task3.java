import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Введите значение для поиска: ");
        int oldValue = scanner.nextInt();
        System.out.print("Введите новое значение: ");
        int newValue = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }

        System.out.println("Изменённый массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
