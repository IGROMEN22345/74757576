import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество углов: ");
        int n = scanner.nextInt();
        int[] angles = new int[n];
        int sum = 0;

        System.out.println("Введите углы:");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        int requiredSum = 180 * (n - 2);
        if (sum == requiredSum) {
            System.out.println("Многоугольник может существовать.");
        } else {
            System.out.println("Многоугольник не может существовать.");
        }
    }
}
