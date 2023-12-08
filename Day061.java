import java.util.Scanner;

public class Day061{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = scanner.nextInt();

        int[] num = new int[n];
        int a = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            num[i] = scanner.nextInt();

            if (num[i] % 3 == 0) {
                a += num[i];
            }
        }

        System.out.println("Angka yang habis dibagi tiga:");
        for (int angka: num) {
            if (angka % 3 == 0) {
                System.out.print(angka+ " ");
            }
        }

        System.out.println("\n HasilJumlah angka yang habis dibagi tiga: " + a);

        scanner.close();
    }
}
