public class Day074{
    public static void main(String[] args) {
        long batasAtas = 100L; 
        long hasil = 0L;

        for (long i = 1L; i <= batasAtas; i++) {
            hasil += i;
        }

        System.out.println("Hasil penjumlahan: " + hasil);
    }
}
