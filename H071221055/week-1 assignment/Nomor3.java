import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        try{
            System.out.print("Nama :");
            String name = input.nextLine();

            System.out.print("Age :");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Hobby :");  
            String hobby = input.nextLine();

            System.out.println("Nama saya " + name + "," +"Umur saya adalah " +  age + " Tahun ,hobby saya adalah " + hobby + ".");
        } catch (Exception e) {
            System.out.println("Umur harus berupa angka");
        }
        input.close() ;
    }
}
