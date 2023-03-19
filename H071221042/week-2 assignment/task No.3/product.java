package no3;

public class product {
    String id;
    String nama;
    int stok;
    int harga;

    public void namaId(String namaId) {
        id = namaId;
    }

    public void namaProduct(String namaProduct) {
        nama = namaProduct;
    }

    public void stokProduct(int stokProduct) {
        stok = stokProduct;
    }

    public String cekStok(){
        if (stok <=0){
            return "Stok kosong";
        } else {
            return "Stok masih ada" ;
        }

    }
    
    public void hargaProduct(int hargaProduct) {
        harga = hargaProduct;
    }
    
    public void detailProduct(){
        System.out.println(id);
        System.out.println(nama);
        System.out.println(harga);
    }
}
