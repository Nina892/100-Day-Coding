import java.util.ArrayList;
public class Day049 {
	public static void main(String[] args) {
        ArrayList<Integer> angka= new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            angka.add(i);
        }

        System.out.println("Angka dari 1 sampai 50:");

        for (Integer a: angka) {
            System.out.print(a+ " ");
        }
    }
}
	