import java.util.Scanner;

public class No7 {
    static String[] kota = { "Jakarta", "Mataram", "Denpasar", "Makassar", "Tangerang", 
                                "Medan", "Batam", "Jayapura", "Palu", "Pontianak", "Balikpapan" };

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("");
        String inputKota = inp.next();
        int indexKota = findIndex(inputKota);
        System.out.println(indexKota);
        inp.close();
    }

    static int findIndex(String inputKota) {
            inputKota = inputKota.toLowerCase();
        int result = -1;
        for (int i = 0; i < kota.length; i++) {
            String kota1 = kota[i];
            kota1 = kota1.toLowerCase();
            if (kota1.equals(inputKota)) {
                result += i + 1;
            }
        }
        ;
        return result;
    }

}