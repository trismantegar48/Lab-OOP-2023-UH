import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim ;

        System.out.print("NIM: ");
        nim = input.next();

        String lastnim = nim.substring(7);
        int x = Integer.parseInt(lastnim);

        System.out.println(x);
        int soal= x %7;

        if (soal == 0){
            soal+=7;
        }

        System.out.println("Soal no "+ soal);
        
        input.close();

    }
}