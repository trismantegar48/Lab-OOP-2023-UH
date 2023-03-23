class Main {
    public static void main(String[] args) {
        TokoKakIchsan kipas = new TokoKakIchsan();
        kipas.ID = 152;
        kipas.nama = "Kipas Angin Multifungsi Murah & Berkualitas";
        kipas.stok = 7;
        kipas.harga = 150000;
        System.out.println("ID : " + kipas.getID());
        System.out.println("Nama : " + kipas.getNama());
        System.out.println("Harga : " + kipas.getHarga());
        System.out.println("Stok : " + kipas.getStok());
        System.out.println("Status : " + kipas.isTersedia());
        System.out.println();

        TokoKakIchsan sabun = new TokoKakIchsan();
        sabun.ID = 269;
        sabun.nama = "Sabun Batang LiveBoy";
        sabun.stok = 0;
        sabun.harga = 20000;
        System.out.println("ID : " + sabun.getID());
        System.out.println("Nama : " + sabun.getNama());
        System.out.println("Harga : " + sabun.getHarga());
        System.out.println("Stok : " + sabun.getStok());
        System.out.println("Status : " + sabun.isTersedia());
        System.out.println();

        TokoKakIchsan bola = new TokoKakIchsan();
        bola.ID = 451;
        bola.nama = "Bola Futbol Anti Kempes";
        bola.stok = 30;
        bola.harga = 230000;
        System.out.println("ID : " + bola.getID());
        System.out.println("Nama : " + bola.getNama());
        System.out.println("Harga : " + bola.getHarga());
        System.out.println("Stok : " + bola.getStok());
        System.out.println("Status : " + bola.isTersedia());
    }
}