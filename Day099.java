public class ContohArray {

    public static void main(String[] args) {
        int[] nilaiMahasiswa = {85, 90, 78, 92, 88};
        double rataRata = hitungRataRata(nilaiMahasiswa);
        System.out.print("Nilai mahasiswa: ");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }
        System.out.println("\nRata-rata nilai: " + rataRata);
    }
    static double hitungRataRata(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai;
        }
        return (double) total / array.length;
    }
}
