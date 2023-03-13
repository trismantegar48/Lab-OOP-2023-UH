import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat;
        System.out.print("Masukkan Kalimat :");
        kalimat = input.nextLine();

        StringBuilder kalimatBaru = new StringBuilder();    

        for(String kata : kalimat.split(" ")) {
            String kataBaru = kata.substring(0,1).toUpperCase()+ kata.substring(1).toLowerCase();
            kalimatBaru.append(kataBaru).append(" ");
        }
        System.out.println(kalimatBaru);
        input.close();
    }
}

