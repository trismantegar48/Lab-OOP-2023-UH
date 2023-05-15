import java.util.Scanner;

public class no5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String kata;
        
        System.out.print("");
        kata = input.next();
        
        //Tanggal
        String tanggal = kata.substring(0, 2);
        int x = Integer.parseInt(tanggal);
        
        //Bulan
        String bulan = kata.substring(3, 5);
        String y=bulan;
        switch (y){
        case "01":
        y= "Januari";
        break;
        case "02":
        y = "Februari";
        break;
        case "03":
        y = "Maret";
        break;
        case "04":
        y = "April";
        break;
        case "05":
        y = "Mei";
        break;
        case "06":
        y = "Juni";
        break;
        case "07":
        y = "Juli";
        break;
        case "08":
        y = "Agustus";
        break;
        case "09":
        y = "September";
        break;
        case "10":
        y = "Oktober";
        break;
        case "11":
        y = "November";
        break;
        case "12":
        y = "Desember";
        break;
    }
    
        //Tahun
        String tahun = kata.substring(6);
        int z = Integer.parseInt(tahun);
        System.out.println(z);
        
        if (z >= 0 && z<10){
            System.out.println(x+" "+ y+" 200"+z);
        }else if (z >= 10 && z<=23) {
            System.out.println(x+" "+ y+" 20"+z);    
        }else {
            System.out.println(x+" "+y+" 19"+z);
        }
        input.close();
    }
}