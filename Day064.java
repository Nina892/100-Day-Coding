import java.util.ArrayList;
import java.util.List;

public class Day064 {

    public static void main(String[] args) {
        List<Integer> angka = new ArrayList<>();
        angka.add(5);
        angka.add(4);
        angka.add(7);
        angka.add(3);
        angka.add(1);
        System.out.print("Angka dalam List: ");
        for (Integer nilai : angka) {
            System.out.print(nilai + " ");
        }
    }
}
