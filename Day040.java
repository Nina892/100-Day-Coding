import java.util.Scanner;

public class Day040{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai (angka): ");
        int nilai = scanner.nextInt();
        if (nilai >= 90) {
            System.out.println("Anda mendapatkan nilai A");
        } else if (nilai >= 80) {
            System.out.println("Anda mendapatkan nilai B");
        } else if (nilai >= 70) {
            System.out.println("Anda mendapatkan nilai C");
        } else if (nilai >= 60) {
            System.out.println("Anda mendapatkan nilai D");
        } else {
            System.out.println("Anda mendapatkan nilai E");
        }

        scanner.close();
    }
}
