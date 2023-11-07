import java.util.Scanner;

public class Day030 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        String inputAngka = inputScanner.nextLine();
        Integer angka = Integer.parseInt(inputAngka);
        Integer hasil = angka * 2;
        System.out.println("Hasil perkalian: " + hasil);
        inputScanner.close();
    }
}
