public class Produk {
    int id;
    String nama;
    int pasokan;
    int biaya;

    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPasokan(int pasokan) {
        this.pasokan = pasokan;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public String cek_pasokan() {
        if (this.pasokan > 0) {
            return ("tersedia");
        } else {
            return ("tidak tersedia");
        }
    }

    public void detail_produk() {
        System.out.printf("ID PRODUK : %d \n", this.id);
        System.out.printf("NAMA PRODUK : %s \n", this.nama);
        System.out.printf("JUMLAH PASOKAN : %d \n", this.pasokan);
        System.out.printf("BIAYA PRODUK : %d \n", this.biaya);
    }

}
