import java.util.Scanner;

public class No7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String area = input.nextLine();
        int daerah = findIndex(area);
        System.out.println(daerah);

        input.close();
    }
    public static int findIndex(String teks) {
        String wilayah[] = {"Makassar", "toraja", "luwu timur", "timika"};
        for (int i = 0; i < wilayah.length; i+=1) {
            if (wilayah[i].equalsIgnoreCase(teks)) {
                return i ;
                
            }
        }
        return -1;
    }    
}