import java.util.Scanner;

public class Day066 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah kata: ");
        String kata = scanner.next();
        if (kata.length() > 5) {
            System.out.println("Kata panjang");
        } else {
            System.out.println("Kata pendek atau sama dengan 5 karakter");
        }
    }
}
