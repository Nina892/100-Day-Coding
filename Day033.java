import java.util.Scanner;

public class Day034{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan ukuran array: ");
        int size = scanner.nextInt();
        String[] names = new String[size];
        System.out.println("Masukkan nama-nama:");
        for (int i = 0; i < size; i++) {
            System.out.print("Nama ke-" + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        System.out.println("\nNama-nama yang dimasukkan:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
