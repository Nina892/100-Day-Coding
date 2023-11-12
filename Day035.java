import java.util.Scanner;

public class Day035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int inputNumber = scanner.nextInt();

        System.out.println("Bilangan Ganjil: " + (inputNumber * 2 - 1));
        System.out.println("Bilangan Genap: " + (inputNumber * 2));

        scanner.close();
    }
}
