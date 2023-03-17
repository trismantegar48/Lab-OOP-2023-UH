public class Produk2 {
    public static void main(String[] args) {

        Produk baju = new Produk();
        baju.setId(12345);
        baju.setNama("Baju");
        baju.setPasokan(200);
        baju.setBiaya(150000);
        System.out.println(baju.cek_pasokan());
        baju.detail_produk();
    }
}