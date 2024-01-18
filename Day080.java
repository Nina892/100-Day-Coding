public class Day080{
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int multiplier = 3;

        System.out.print("Array setelah dikalikan: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= multiplier;
            System.out.print(numbers[i] + " ");
        }
    }
}
