import java.util.Scanner;

public class Day052{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int inputangka= scanner.nextInt();{
            if (inputangka % 2 == 0) {
                System.out.println("Angka yang dimasukkan adalah genap.");
            } else {
                System.out.println("Angka yang dimasukkan adalah ganjil.");
            }

            if (inputangka % 3 == 0) {
                System.out.println("Angka yang dimasukkan habis dibagi tiga.");
            } else {
                System.out.println("Angka yang dimasukkan tidak habis dibagi tiga.");
            }
        }
    }
}
