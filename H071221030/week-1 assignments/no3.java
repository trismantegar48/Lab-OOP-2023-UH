import java.util.Scanner;

class no3 {
    public static void main(String[] args){
    // Program menerima inputan nama
        Scanner inputNama = new Scanner(System.in);
        System.out.print("Name : ");
        String nama = inputNama.nextLine();

    // Program menerima inputan umur
    try {
        Scanner inputUmur = new Scanner(System.in);
        System.out.print("Umur : ");
        int umur = inputUmur.nextInt();

    // Program menerima inputan hobby
        Scanner inputHobby = new Scanner(System.in);
        System.out.print("Hobby : ");
        String hobby = inputHobby.nextLine();

    // Output Program
        System.out.println("Nama Saya " + nama + ", " + umur + " tahun, " + "hobby " + hobby);

    } catch (Exception e) {
    // Inputan Umur bukan sebuah integer
        System.out.println("Umur bukan angka");
        }
    }
}