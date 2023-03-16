import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {
        String [] namaHewan = {"Kucing" , "Anjing" , "Kuda" , "Sapi" , "Nyamuk"} ;
        Scanner input = new Scanner (System.in) ;
        System.out.println("Masukkan nama hewan yang dicari :");
        String cari = input.nextLine() ;
        input.close();

        System.out.println(findIndex(namaHewan, cari));
    }
    public static int findIndex (String[] array, String teks) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(teks)) {  
                return i ;
            }
        }
        return -1 ;  
    }
}
