import java.io.Console;
public class InputConsole {
    public static void main(String[] args) {

        String nama;
        int usia;

        // membuat objek console
        Console con = System.console();

        // mengisi variabel nama dan usia dengan console
        System.out.print("Inputkan nama: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: ");
        usia = Integer.parseInt(con.readLine());

        // mengampilkan isi variabel nama dan usia
        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Usia kmu adalah:"+ usia);
	}
}