import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {

        Scanner inpNIM = new Scanner(System.in);
        System.out.print("NIM: ");
        String NIM = inpNIM.nextLine();
        System.out.print("Soal : no.");
        int number = Integer.parseInt(NIM.substring(NIM.length() - 3));
        
        if (number % 7 == 0) {
            System.out.println(7);

        } else {
            System.out.println(number % 7);
        }
        inpNIM.close();

    }
}