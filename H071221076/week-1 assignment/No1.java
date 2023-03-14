import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner inputNim = new Scanner(System.in);
        String Nim;
        System.out.print("NIM : ");
        Nim = inputNim.nextLine();
        String nomor = Nim.substring(7, 10);
        int num = Integer.parseInt(nomor);
        inputNim.close();
        if (num % 7 == 0){
            System.out.println("Soal : no 7 ");
        }else{
            System.out.println("Soal : no " + num % 7);
        }
    }
}