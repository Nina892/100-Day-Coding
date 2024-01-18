public class Day073{
	public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }

        System.out.println("Jumlah bilangan genap dari 1 hingga 10 adalah: " + total);
    }
}
