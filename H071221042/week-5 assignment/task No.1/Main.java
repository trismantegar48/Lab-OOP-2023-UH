public class Main{
    public static void main(String[] args) {
        //persegi
        persegi persegi1 = new persegi(9);
        //persegi panjang 
        persegiPanjang persegiPanjang1= new persegiPanjang(4, 3);
        //lingkaran
        lingkaran lingkaran1 = new lingkaran(4);
        //segitiga
        segitiga segitiga1 = new segitiga(2, 4);
        //trapesium
        trapesium trapesium1 = new trapesium(4, 8, 4);
        
        
        // kubus
        kubus kubus1 = new kubus(6);
        // balok
        balok balok1 = new balok(4, 4, 8);
        
        // bola
        bola bola1 = new bola(10);
        
        // tabung
        tabung tabung1 = new tabung(10, 15);
        

        //Menu
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("1. PERSEGI");
        System.out.println("2. PERSEGI PANJANG");
        System.out.println("3. LINGKARAN");
        System.out.println("4. SEGITIGA");
        System.out.println("5. TRAPESIUM");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("--------------------------|");
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("Volume kubus  : " +kubus1.hitungVolume());
        System.out.println("Volume balok  : " +balok1.hitungVolume());
        System.out.println("Volume bola   : " +bola1.hitungVolume());
        System.out.println("Volume tabung : " +tabung1.hitungVolume());
        System.out.println("--------------------------|");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("Luas persegi         : " +persegi1.hitungLuas());
        System.out.println("Luas persegi panjang : " +persegiPanjang1.hitungLuas());
        System.out.println("Luas lingkaran       : " +lingkaran1.hitugLuas());
        System.out.println("Luas segitiga        : " +segitiga1.hitungLuas());
        System.out.println("Luas luas            : " +trapesium1.hitungLuas());
        System.out.println("--------------------------|");
    }
}