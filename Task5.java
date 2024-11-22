import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean isAscending = true, isDescending = true;

        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscending = false;
            }
            if (array[i] < array[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            System.out.println("Массив возрастает.");
        } else if (isDescending) {
            System.out.println("Массив убывает.");
        } else {
            System.out.println("Массив не является ни возрастающим, ни убывающим.");
        }
    }
}
