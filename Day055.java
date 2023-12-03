public class Day055{
	public static void main(String[] args) {
		Integer[] angka ={1,2,3};
		System.out.print("Elemen array: ");
		for (Integer angka1: angka){
			System.out.print(angka+ " ");
		}
		int sum = 0;
		for(Integer angka1 : angka){
			sum += angka1;
		}
		System.out.println("\n jumlah elemen array adalah: " + sum);
	}
}