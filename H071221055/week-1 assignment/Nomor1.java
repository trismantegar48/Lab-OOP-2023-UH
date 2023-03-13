import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        String nim;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM:");
        nim = input.next();
        String inp = nim.substring(nim.length() - 3);
        int angka = Integer.parseInt(inp);
        if (angka % 7 == 0) {
            System.out.print("Soal: No 7");
        } else {
            System.out.printf("Soal: No %d\n", angka % 7);
        }
        input.close();
    }
}
