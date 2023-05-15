package no5;

public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Jl. Bacan 34";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat= alamat;
        mahasiswa.nama= "KELVIN";
        mahasiswa.nim= "H071221042";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("NIM: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+mahasiswa.getAlamat().getAlamatLengkap());
    }
}
