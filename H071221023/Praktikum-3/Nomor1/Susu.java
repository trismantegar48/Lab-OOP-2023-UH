public class Susu {
    private String nama;
    private int harga;
    private String jenis;
    private int stok;

    public Susu(String nama, int harga, String jenis) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
        this.stok = 0;
    }

    public Susu(String nama, int harga, String jenis, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println(
                "Susu " + this.nama + " jenis " + this.jenis + " dijual dengan harga " + this.harga + " per liter.");
    }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
        System.out.println("Menambahkan " + jumlah + " liter " + this.nama + " ke dalam stok.");
    }

    public String toString() {
        return this.nama + " (" + this.jenis + ")";
    }

    public int getStok() {
        return this.stok;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return this.harga;
    }
}
