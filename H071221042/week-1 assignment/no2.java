import java.util.Scanner;

public class no2 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        int n;
        int bulat= 0;
        int desimal= 0;

        try{
        System.out.print("");
        n = input.nextInt();

    
        for (int i = 1; i <= n; i++){
            System.out.print("");
            double y = input.nextDouble();
            if (y%1==0){
                bulat ++;
            } else if (y==0) {
                bulat ++;
            } else {
                desimal++;
            }
            System.out.println(bulat+ " Bilangan Bulat");
            System.out.println(desimal+ " Bilangan Desimal");
            
        }
        } catch (Exception x) {
        System.err.println("Inputan harus berupa bilangan");
    }
       
   
        input.close();
 }
}