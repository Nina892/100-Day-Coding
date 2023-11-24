import java.util.Scanner;

public class Day047{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        Integer batasRemaja = 18;

        if (umur <= batasRemaja) {
            System.out.println("Anda masih remaja.");
        } else {
            System.out.println("Anda sudah dewasa.");
        }

        scanner.close();
    }
}
