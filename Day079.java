public class Day079 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int searchElement = 30;
        boolean found = false;

        for (int num : numbers) {
            if (num == searchElement) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Elemen ditemukan dalam array.");
        } else {
            System.out.println("Elemen tidak ditemukan dalam array.");
        }
    }
}
