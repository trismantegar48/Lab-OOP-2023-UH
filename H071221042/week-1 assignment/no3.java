import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int umur;
        String hobi;
        
        System.out.print("Name: ");
        nama = input.next();
        
        try {
            System.out.print("Umur: ");
            umur = input.nextInt();
            System.out.print("Hobby: ");
            hobi = input.next();
            System.out.println("Halo nama saya " + nama + ", " + umur + "tahun, " + "hobby " + hobi);
            input.close();
        } catch (Exception x) {
            System.err.println("Inputan harus berupa Integer");
        }


    }
}
