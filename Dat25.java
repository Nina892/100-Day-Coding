import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nama = new ArrayList();

        // Menambahkan nama ke List
        nama.add("Amel");
        nama.add("Nina");
        nama.add("lala");

        // Menampilkan isi 
        System.out.println("Daftar Nama: ");
        for (String daftarNama : nama) {
            System.out.println(daftarNama);
        }
    }
}
