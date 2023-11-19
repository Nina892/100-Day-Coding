import java.util.Scanner;

public class Day041{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas awal: ");
        int batas_awal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int batas_akhir = scanner.nextInt();
        System.out.println("Angka ganjil:");
        for (int i = batas_awal; i <= batas_akhir; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nAngka genap:");
        for (int i = batas_awal; i <= batas_akhir; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nHasil pengurangan:");
        for (int i = batas_awal; i < batas_akhir; i++) {
            int hasil = i - (i + 1);
            System.out.print(hasil + " ");
        }
        scanner.close();
    }
}
