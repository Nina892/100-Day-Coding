public class Day0014 {
  public static void main(String[] args) {
   
        String[] name = {"Eko", "Kurniawan", "Khannedy", "Programmer", "Zaman", "Now"};
        String[] target = new String[5];
    
        // menyalin array name diposisi 3, ke posisi 2 array target, sebanyak 3 data
        System.arraycopy(name, 5, target, 2, 1);
    
        System.out.println(target[0]); 
        System.out.println(target[1]);
        System.out.println(target[2]); 
        System.out.println(target[3]); 
        System.out.println(target[4]); 
    
      }
    }


    
