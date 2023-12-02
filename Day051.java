import java.util.Scanner;

public class Day051{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dijumlahkan: ");
        int jumlahAngka = scanner.nextInt();

        double total = 0;

        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            double angka = scanner.nextDouble();
            total += angka;
        }
        System.out.println("Total jumlah angka: " + total);
    }
}

  