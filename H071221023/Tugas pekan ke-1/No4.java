import java.util.Scanner;

public class No4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String kalimat = input.nextLine(); 
        String[] kata = kalimat.toLowerCase().split(" ");
        String newkalimat = "";
        for (int i = 0; i < kata.length; i++) {
            newkalimat += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " ";
        }
        
        System.out.println(newkalimat);

        input.close();
    }
}
