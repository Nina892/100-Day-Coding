import java.util.Scanner;

public class Day059{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        System.out.println("Masukkan angka (masukkan 0 untuk mengakhiri):");

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break; 
            }

            total += input;
        }

        System.out.println("Total jumlah: " + total);
        scanner.close();
    }
}
