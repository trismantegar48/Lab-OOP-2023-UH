class Produk{
    String id;
    String nama;
    int stok;
    int harga;

    boolean isAvailable(){
        return this.stok > 0;
    }

    public String getId(){  
        return id;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return harga;
    }
}

public class No3{
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        Produk produk2 = new Produk();

        produk1.id = "H0001";
        produk1.nama = "Baju kaos";
        produk1.stok = 10;
        produk1.harga = 50000;

        produk2.id = "H0002";
        produk2.nama = "Celana pendek";
        produk2.stok = 0;
        produk2.harga = 35000;

        if (produk1.stok > 0){
        System.out.println("Stok tersedia");}
        else{
            System.out.println("Stok tidak tersedia");
        }
        if (produk2.stok > 0) {
            System.out.println("Stok tersedia");
        } else {
            System.out.println("Stok tidak tersedia");
        }

    }
}