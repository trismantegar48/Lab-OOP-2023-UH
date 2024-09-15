public class Product {
    private String nama;
    private int price;
    private int stok;

    
    public Product(String nama, int price, int stok) {
        this.nama = nama;
        this.price = price;
        this.stok = stok;
    }
    
    public Product(String nama, String price, int stok){
        this.nama = nama;
        this.stok = stok;
        this.price = ubahPrice(price);
    }    

    private int ubahPrice(String price) {
        int conver = 0;
        if (price.endsWith("k")) {
            conver = 1000;
            price = price.substring(0, price.length() - 1);
        }
        return Integer.parseInt(price)*conver;
    }

    public String getNama() {
        return nama;
    }

    public int getPrice() {
        return price;
    }

    public int getStok() {
        return stok;
    }

    public void sell() {
        stok--;
    }
}
