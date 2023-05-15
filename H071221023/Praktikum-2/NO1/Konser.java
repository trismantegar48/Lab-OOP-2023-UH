public class Konser {
    String pensismanses;
    double waktu;
    String veneu;
    String tiket;
    int harga;

    public void setpensismanses(String pensismanses) {
        this.pensismanses = pensismanses;
    }

    public String getpensismanses() {
        return pensismanses;
    }

    public void setwaktu(double waktu) {
        this.waktu = waktu;
    }

    public double getwaktu() {
        return waktu;
    }

    public void setveneu(String veneu) {
        this.veneu = veneu;
    }

    public String getveneu() {
        return veneu;
    }

    public void settiket(String tiket) {
        this.tiket = tiket;
    }

    public String gettiket() {
        return tiket;
    }

    public void setharga(int harga) {
        this.harga = harga;
    }

    public int getharga() {
        return harga;
    }

    public void infokonser() {
        System.out.println("INFO LENGKAP MENGENAI" + pensismanses);
        System.out.println("Waktu konser: " + waktu);
        System.out.println("Veneu       : " + veneu);
        System.out.println("Jenis tiket : " + tiket);
        System.out.println("Harga tiket : " + harga);
    }

}
