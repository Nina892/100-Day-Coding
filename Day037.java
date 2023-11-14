import java.util.Scanner;

public class Day037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");

        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan sisi persegi: ");
            double sisi = scanner.nextDouble();

            double luas = sisi * sisi;
            double keliling = 4 * sisi;

            System.out.println("Luas persegi: " + luas);
            System.out.println("Keliling persegi: " + keliling);
        } else if (pilihan == 2) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = scanner.nextDouble();

            double luas = Math.PI * jariJari * jariJari;
            double keliling = 2 * Math.PI * jariJari;

            System.out.println("Luas lingkaran: " + luas);
            System.out.println("Keliling lingkaran: " + keliling);
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}

