public class Task4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 90; i++) {
            System.out.printf("%.2f ", Math.sin(Math.toRadians(i)));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
