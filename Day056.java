import java.math.BigInteger;
import java.util.Scanner;

public class Day056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        BigInteger angka1 = new BigInteger(scanner.next());

        System.out.print("Masukkan angka kedua: ");
        BigInteger angka2 = new BigInteger(scanner.next());

        int hasilPerbandingan = angka1.compareTo(angka2);
        if (hasilPerbandingan > 0) {
            System.out.println(angka1 + " lebih besar dari " + angka2);
        } else if (hasilPerbandingan < 0) {
            System.out.println(angka1 + " lebih kecil dari " + angka2);
        } else {
            System.out.println(angka1 + " sama dengan " + angka2);
        }

        scanner.close();
    }
}