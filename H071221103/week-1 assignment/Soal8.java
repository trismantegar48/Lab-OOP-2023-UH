import java.util.Scanner;

class Soal8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sebuah bilangan
        try {
            System.out.print("Masukkan satu bilangan : ");
            int bilangan = scanner.nextInt();
        // inputan disimpan kedalam sebuah variabel bilangan

        int[][] array2D = {{1,2,3}, {4,5,6}, {7,8,9}};
        boolean found = false;
        // mencari apakah bilangan yang diinput terdapat pada array dengan menngunakan boolean found

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == bilangan) {
                    System.out.println("Bilangan " + bilangan + " ditemukan pada indeks [" + i + "][" + j + "]");
                    found = true;
                }
            
            }
        }
        if (!found) {
            System.out.println("Bilangan " + bilangan + " tidak ditemukan pada array 2D");
        } 
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");

        }
        scanner.close();
    }
 }
