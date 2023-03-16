import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilanganbulat = 0, bilangandesimal = 0;
    try{
        System.out.print("Masukkan Jumlah Bilangan :");
        int inputan = input.nextInt();
        int i;
        for (i = 0; i < inputan; i++) {
            double angka = input.nextDouble();
            if (angka % 1 == 0) {
                bilanganbulat++;
            }else {
                bilangandesimal++;
            }

        }
        System.out.println(bilanganbulat + " " + "bilangan bulat");
        System.out.println(bilangandesimal + " " + "bilangan desimal");
        input.close();
        } catch (Exception e) {
        System.out.println("Input Harus Berupa Angka");
    }
    }
}
