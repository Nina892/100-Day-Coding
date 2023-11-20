import java.util.ArrayList;

public class Day043{
    public static void main(String[] args) {
        ArrayList<Integer> Arr= new ArrayList<>();
        Arr.add(1);
        Arr.add(2);
        Arr.add(3);
        Arr.add(4);
        Arr.add(5);
        Arr.remove(Integer.valueOf(2));
        for (int element : Arr) {
            System.out.print(element + " ");
        }
    }
}