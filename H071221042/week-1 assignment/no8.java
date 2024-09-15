import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cari;

        try{
        System.out.print("");
        cari = input.nextInt();

        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == cari) {
                    System.out.println("Found " + cari+ " at [" + i+ "][" + j+ "]");
                }
            }
        }         
        input.close();
        } catch (Exception e){
            System.out.println("Inputan harus integer");
        }
    }
}