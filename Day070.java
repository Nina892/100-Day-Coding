import java.util.Scanner;

public class Day070 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan hari dalam seminggu (1-7): ");
        int nomorHari = scanner.nextInt();

        String namaHari;
        switch (nomorHari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                namaHari = "Hari tidak valid";
        }

        System.out.println("Hari ke-" + nomorHari + " adalah " + namaHari);
    }
}
