import java.util.Scanner;

public class Day075{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas atas: ");
        long batasAtas = scanner.nextLong();

        if (batasAtas <= 0) {
            System.out.println("Masukkan nilai yang lebih besar dari 0.");
        } else {
            long hasil = hitungPenjumlahan(batasAtas);
            System.out.println("Hasil penjumlahan: " + hasil);
        }
    }

    private static long hitungPenjumlahan(long batasAtas) {
        return (batasAtas * (batasAtas + 1)) / 2;
    }
}