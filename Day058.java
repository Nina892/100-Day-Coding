import java.util.Scanner;

public class Day058{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas perulangan: ");
        int batas = scanner.nextInt();

        for (int i = 1; i <= batas; i++) {
            System.out.println("Iterasi ke-" + i);
        }

        scanner.close();
    }
}
