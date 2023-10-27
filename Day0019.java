public class TotalAngka {

	public static void main(String[] args){
		int[] angka = new int[100];

		int x = 1;
		//untuk memberi nilai pada tiap index
		for (int i = 0; i < angka.length; i++) {
			angka[i] = x;
			x++;
		}

		int total = 0;
		//untuk menjumlahkan nilai 1-100
		for (int i = 0; i < angka.length; i++) {
			total+=angka[i];
		}

		System.out.println(total);
	}

}he bytes
        int data = input.read();
        System.out.print(data + ", ");
      }
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}
