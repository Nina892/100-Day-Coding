public class Day077 {
    public static void main(String[] args) {
        int[] values = {8, 3, 11, 6, 2};
        int max = values[0];

        for (int val : values) {
            if (val > max) {
                max = val;
            }
        }

        System.out.println("Nilai maksimum dalam array: " + max);
    }
}
