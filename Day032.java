import java.util.Scanner;

public class Day032{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai boolean (true/false): ");
        boolean status = scanner.nextBoolean();

        System.out.print("Masukkan nilai byte (0-100): ");
        byte nilaiByte = scanner.nextByte();

        System.out.println("Status: " + status);
        System.out.println("Nilai byte: " + nilaiByte);

        scanner.close();
    }
}
