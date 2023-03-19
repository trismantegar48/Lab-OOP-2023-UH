import java.util.Scanner;

public class no6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jari;
        double luas;

        try{
            System.out.print("Jari-jari: ");
            jari = input.nextInt();
            luas = 3.14*jari*jari;
    
            System.out.printf("Hasil: "+"%.2f ", luas);
            input.close();
        } catch (Exception e){
            System.out.println("Inputan harus integer");
        }


    }
}
