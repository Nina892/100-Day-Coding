import java.util.ArrayList;
import java.util.List;

public class Day065 {

    public static void main(String[] args) {
        List<Double> angka = new ArrayList<>();
        angka.add(3.5);
        angka.add(7.2);
        angka.add(4.8);
        angka.add(6.1);
        angka.add(5.0);
        System.out.print("Angka dalam List: ");
        for (Double nilai : angka) {
            System.out.print(nilai + " ");
        }
    }
}
