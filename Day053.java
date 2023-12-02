import java.util.Scanner;

public class Day053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka bulat: ");
        int angka = scanner.nextInt();
        if (angka > 0) {
            System.out.println(angka + " adalah angka positif.");
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah angka genap.");
            } else {
                System.out.println(angka + " adalah angka ganjil.");
            }
        } else if (angka == 0) {
            System.out.println(angka + " adalah angka nol.");
        } else {
            System.out.println(angka + " adalah angka negatif.");
        }

        scanner.close();
    }
}
