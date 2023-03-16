import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            try {
                System.out.print("Name : ");
                String a = input.nextLine();       
                System.out.print("Umur : ");
                int b = input.nextInt();
                input.nextLine();
                System.out.print("Hobby : ");
                String c = input.nextLine();
                input.close();
                System.out.println("Nama saya " + a + ", " + b + " tahun, " + "hobby " + c );
            } catch (Exception e) {
                System.out.println("inputan umur harus berupa angka");
            }
    }
    
}
