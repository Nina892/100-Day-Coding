import java.util.Random;

public class Day071{
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Bilangan acak antara 1 dan 100: " + randomNumber);
    }
}
