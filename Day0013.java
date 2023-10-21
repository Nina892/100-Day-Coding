public class Day0013 {
    static void main(String[] args) {
              String[] arrayName = new String[3];
          
              // Panjang array tetap 3 walaupun data array kosong semua
              int panjangArray = arrayName.length; // 3
              System.out.println(panjangArray);
          
              arrayName[0] = "Eka";
              arrayName[1] = "nuyy";
              arrayName[2] = "naya";
          
              // Panjang array tetap 3, walaupun data array penuh semua
              System.out.println(arrayName.length); // 3
          
            }
        }