import java.util.Scanner;

class no1 {
    public static void main(String[] args){
    // Program menerima inputan NIM
        Scanner inputNIM = new Scanner(System.in);
        System.out.print("NIM : ");
        String nim = inputNIM.nextLine();

    // Program mengambil 3 bilangan terakhir
        String nomor = nim.substring(7, 10);
        int num = Integer.parseInt(nomor);

    // Dari Soal dapat dilihat jika pola bilangan tersebut adalah modulo 7, maka :
        if (num % 7 == 0) {
            System.out.print("Soal : no 7");
        } else {
            System.out.print("Soal : no " + num % 7);
        }
    }
}