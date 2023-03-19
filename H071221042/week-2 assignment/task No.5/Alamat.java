package no5;

public class Alamat {
    String jalan;
    String kota;
    
    public String getAlamatLengkap() {
        String alamatLengkap= jalan+", "+kota;
        return alamatLengkap ; 
    }
}

