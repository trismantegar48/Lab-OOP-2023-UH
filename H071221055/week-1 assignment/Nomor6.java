import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try{
            System.out.println("Masukkan Jari-jari Lingkaran");
            double r = input.nextDouble();

            String luas = String.format ("%.2f" , (Math.PI * r *r)) ;  

            System.out.println("Luas Lingkaran = " + luas);

        } catch (Exception e) {
            System.out.println("Input Harus Berupa Angka");

        }
        input.close();
    }
    
}
