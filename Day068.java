import java.util.Scanner;

public class Day068{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda suka buah pisang? (ya/tidak): ");
        String jawaban = scanner.next().toLowerCase();

        boolean sukaPisang = jawaban.equals("ya");

        System.out.println("Anda " + (sukaPisang ? "suka" : "tidak suka") + " buah pisang.");
    }
}
