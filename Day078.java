public class Day078{
    public static void main(String[] args) {
        int[] marks = {75, 80, 90, 85, 95};
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        double average = (double) total / marks.length;
        System.out.println("Rata-rata nilai: " + average);
    }
}
