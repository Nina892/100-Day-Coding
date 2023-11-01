import java.util.Scanner;

public class NonPrimitifExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Nama: " + nama);
        
        System.out.print("Masukkan umur: ");
        int umur= input.nextInt();
        System.out.println("umur: " + umur);
        
        System.out.print("Masukkan berat badan: ");
        double brt_bd= input.nextDouble();
        System.out.println("brt_bd: " + brt_bd);
        
        System.out.print("Masukkan ukuran baju: ");
        char ukuran_bju= input.next().charAt(0);
        System.out.println("ukuran_bju: " + ukuran_bju);
        
        input.close();
    }
}
