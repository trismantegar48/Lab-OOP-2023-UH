import java.util.InputMismatchException;
import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            double r, luas, phi = 3.14;
        
            System.out.print("Masukkan jari-jari lingkaran: ");
            r = input.nextDouble();
   
            luas = phi*r*r;
            System.out.printf("Luas lingkaran adalah: %.2f", luas);
         } catch (InputMismatchException e) {
            System.out.println("Hanya menerima angka");
         }
         input.close();
    }
}