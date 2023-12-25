import java.util.Scanner;

public class Day069 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Apakah Anda suka kucing? (ya/tidak): ");
        String jawaban = scanner.next().toLowerCase();

        boolean sukaKucing = jawaban.equals("ya");
        System.out.println("===================================");
        System.out.println("          Hasil Pertanyaan          ");
        System.out.println("===================================");
        System.out.println("Pertanyaan: Apakah Anda suka kucing?");
        System.out.println("Jawaban   : " + jawaban);
        System.out.println("-----------------------------------");
       
        if (sukaKucing) {
            System.out.println("Terima kasih karena suka kucing!");
            System.out.println("Anda adalah orang yang menyenangkan.");
        } else {
            System.out.println("Oh, sayang sekali Anda tidak suka kucing.");
            System.out.println("Mungkin suatu hari nanti Anda akan menyukainya!");
        }
        System.out.println("===================================");

    }
}
