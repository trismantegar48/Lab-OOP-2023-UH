import java.util.InputMismatchException;
import java.util.Scanner;

public class no2 {
    
    public static void main(String[] args) {
        Scanner jumlah = new Scanner(System.in);
        try {
        // Program menerima inputan jumlah bilangan
            int n = jumlah.nextInt();
            int bulat = 0;
            int desimal = 0;

        Scanner angka = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
        // Program menerima inputan bilangan
            double bilangan = angka.nextDouble();

        if (bilangan % 1 == 0) {
            bulat++;
        } else {
            desimal++;
        }
    }

        System.out.println(bulat + " Bilangan Bulat");
        System.out.println(desimal + " Bilangan Desimal");

    } catch (InputMismatchException e) {
        System.out.println("Inputan bukan angka");
    }
    }
}