import java.util.InputMismatchException;
import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        // Program menerima inputan jari-jari
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan Jari-jari : ");
            double jari = input.nextDouble();
            
        // Program melakukan operasi perhitungan luas lingkaran
            double luas = Math.PI * Math.pow(jari, 2);
            
        // %.2f berfungsi membulatkan bilangan ke 2 angka di belakang koma
            System.out.printf("Luas Lingkaran adalah : %.2f", luas );

        } catch (InputMismatchException e) {
            System.out.println("Inputan bukan angka");
        }
    }
}
