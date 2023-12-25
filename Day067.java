import java.util.Scanner;

public class Day067 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka (1-3): ");
        int angka = scanner.nextInt();
        switch (angka) {
            case 1:
                System.out.println("Anda memasukkan angka satu");
                break;
            case 2:
                System.out.println("Anda memasukkan angka dua");
                break;
            case 3:
                System.out.println("Anda memasukkan angka tiga");
                break;
            default:
                System.out.println("Angka diluar rentang yang diizinkan");
        }
    }
}
