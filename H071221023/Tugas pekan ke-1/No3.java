import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Name : ");
            String nama = input.nextLine();
            System.out.print("Umur : ");
            int umur = input.nextInt();
            input.nextLine();
            System.out.print("Hobby : ");
            String hobby = input.nextLine();
            System.out.println("Nama saya " + nama + ", " + umur + " tahun, " + "hobby " + hobby);
            
        } catch (Exception e) {
            System.out.println("bukan angka");
        }
        input.close();
    }

}
