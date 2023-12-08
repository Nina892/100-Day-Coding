import java.util.Scanner;

public class Day060 {
    public static void main(String[] args) {
        System.out.print("Masukkan nilai pertama: ");
        int nilai1 = new Scanner(System.in).nextInt();
        System.out.print("Masukkan nilai kedua: ");
        int nilai2 = new Scanner(System.in).nextInt();
        int total = nilai1 + nilai2;
        System.out.println("Total: " + total);
    }
}
