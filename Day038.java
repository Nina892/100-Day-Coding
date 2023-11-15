import java.util.Scanner;

public class Day038{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = input.nextDouble();

        double keliling = hitungKelilingLingkaran(jariJari);

        System.out.println("Keliling lingkaran adalah: " + keliling);
    }

    private static double hitungKelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }
}
