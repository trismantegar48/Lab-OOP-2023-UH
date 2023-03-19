public class TokoKakIchsan {
    int ID;
    String nama;
    int stok;
    double harga;

    public int getID() {
        return this.ID;
    }

    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return this.stok;
    }

    public String getHarga() {
        return "Rp." + this.harga;
    }

    public String isTersedia() {
        return this.stok > 0 ? "Tersedia" : "Kosong";
    }
}