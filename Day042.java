public class Day042{
    public static void main(String[] args) {
        int[] Arr= {1, 2, 3, 4, 5};
        Arr[1] = 10;
        int[] newArray = new int[Arr.length + 1];
        System.arraycopy(Arr, 0, newArray, 0, Arr.length);
        newArray[Arr.length] = 8;

        Arr= newArray;
        for (int element : Arr) {
            System.out.print(element + " ");
        }
    }
}