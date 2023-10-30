public class ContohTipeDataNonPrimitif {
    public static void main(String[] args) {
        // Contoh tipe data String
        String nama = "Nina";
        System.out.println("Nama: " + nama);

        // Contoh tipe data Array
        int[] angka = {1, 2, 3, 4, 5};
        System.out.println("Elemen-elemen dalam array:");
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        // Contoh tipe data Object
        Person person = new Person("Nina", 25);
        System.out.println("Nama: " + person.getNama() + ", Umur: " + person.getUmur());
    }
}

class Person {
    private String nama;
    private int umur;

    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }
}

