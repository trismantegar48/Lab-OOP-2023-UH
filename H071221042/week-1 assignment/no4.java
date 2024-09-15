import java.util.Scanner;
public class no4 {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String nama;
      
      System.out.print("Judul Film: ");
      nama = input.nextLine();

      String x[] = nama.split(" ");

      for (String i: x) {
        System.out.print(i.substring(0, 1).toUpperCase()+ i.substring(1)+" ");
      }



      input.close();
    }
  }