import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] [j] == angka ) {
                    System.out.println("Found " + angka + " at " + "[" + i + "]" + "[" + j + "]");
                    return;
                }
            }
        } 
    } 
}