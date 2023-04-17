class Alamat{
    String jalan;
    String Kota;

    public String getAlamatLengkap() {
        return jalan + ", " + Kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public Alamat getAlamat() {
        return alamat;
    }
}
class Main{
    public static void main (String[] args) {
        Alamat alamat = new Alamat ();
        alamat.jalan = "Tamanlanrea Indah";
        alamat.Kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Evangelista";
        mahasiswa.nim = "H071221103";
        
        System.out.println("Nama:" + mahasiswa.getNama ());
        System.out.println("Nim:" + mahasiswa.getNim ());
        System.out.println("Alamat:" + mahasiswa.getAlamat ().getAlamatLengkap ());
    }
}