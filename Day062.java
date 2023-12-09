public class Day062{
    public static void main(String[] args) {
        Integer[] no = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (Integer number : no) {
            System.out.println(number);
            if (number >=5) {
                break;
            }
        }
    }
}

