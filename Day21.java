import java.util.ArrayList;

public class NonPrimitifExample{
	public static void main(String[] args) {
		ArrayList<String> daftarNama = new ArrayList<String>();
		daftarNama.add("Lina");
		daftarNama.add("Nina");
		daftarNama.add("Amel");
		System.out.println("Nama pertama adalah: "+daftarNama.get(0));
		System.out.println("jumlah nama dalam daftar adalah:"+ daftarNama.size());
	}
}