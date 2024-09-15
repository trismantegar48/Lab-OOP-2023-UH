package no1;

public class outfit {
    String baju;
    String celana;
    String sepatu;
    boolean topi;
    int gelang;

    public void merkbaju(String merkbaju){
        baju = merkbaju;
    }
    
    public void merkcelana(String merkcelana) {
        celana = merkcelana;
    }

    public void merksepatu(String merksepatu) {
        sepatu = merksepatu;
    }

    public void pakaitopi(boolean pakaitopi) {
        topi = pakaitopi;
    }

    public void banyakgelang(int banyakgelang) {
        gelang = banyakgelang;
    }

    public void hasiloutfit(){
        System.out.println("Saya memakai baju "+ baju);
        System.out.println("dengan celana "+ celana);
        System.out.println("serta sepatu "+ sepatu);

        if (topi == true) {
            System.out.println("Pakai topi");
        } else{
            System.out.println("Tidak pakai topi");
        }

        if (gelang==0){
            System.out.println("Tidak memakai gelang");
        } else {
            System.out.println("Pakai " + gelang + " gelang");
        }
    }
    


}
    

