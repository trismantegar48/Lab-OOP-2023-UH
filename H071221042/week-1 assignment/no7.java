import java.util.Scanner;


public class no7 {
    public static void main(String[] args) {
        String[] hewan = {"Ayam", "Bebek", "Burung", "Singa", "Beruang"};
        Scanner input = new Scanner(System.in);
        int index = -1;

        System.out.print("");
        String cari = input.nextLine();

        for (int i = 0; i < hewan.length; i++) {
            if (hewan[i].equalsIgnoreCase(cari)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(index);
        } else {
            System.out.println(index);
        }
        input.close();
    }
}