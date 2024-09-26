import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan jari-jari : ");
            double jarijari = input.nextDouble();
            System.out.printf("Luas lingkaran : %.2f", Math.PI * jarijari * jarijari );
            
        } catch (Exception e) {
            System.out.println("Masukkan Angka");
        }
        input.close();
    }

}
