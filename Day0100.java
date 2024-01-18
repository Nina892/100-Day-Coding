import java.util.ArrayList;
import java.util.List;

public class Day0100{
    private List<Integer> buffer;
    private int capacity;

    public IntegerBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new ArrayList<>(capacity);
    }

    public void addValue(int value) {
        if (buffer.size() < capacity) {
            buffer.add(value);
            System.out.println("Nilai " + value + " ditambahkan ke buffer.");
        } else {
            System.out.println("Buffer sudah penuh, tidak bisa menambahkan nilai baru.");
        }
    }

    public void displayBuffer() {
        System.out.println("Isi Buffer:");
        for (Integer value : buffer) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerBuffer integerBuffer = new IntegerBuffer(5);

        for (int i = 10; i <= 60; i += 10) {
            integerBuffer.addValue(i);
        }

        integerBuffer.displayBuffer();
    }
}
