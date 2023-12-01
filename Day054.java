import java.util.Scanner;

public class Day054{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai byte: ");
        Byte myByte = scanner.nextByte();

        if (myByte > 0) {
            System.out.println("Nilai byte positif.");
        } else if (myByte < 0) {
            System.out.println("Nilai byte negatif.");
        } else {
            System.out.println("Nilai byte nol.");
        }
    }
}

