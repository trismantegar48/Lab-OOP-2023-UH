public class Unhas {
    private String kampus = "Universitas Hassanuddin";

    public String getKampus() {
        return kampus;
    }
}

class PengurusInti extends Unhas {
    private String namaPengurus;

    public PengurusInti (String namaPengurus){
        this.namaPengurus= namaPengurus;
    }

    public String getNamaPengurus() {
        return namaPengurus;
    }
}

class Ketua extends PengurusInti{
    private String  tugas;

    public Ketua(String namaPengurus, String tugas) {
        super(namaPengurus);
        this.tugas= tugas;
    }

    public String getTugas() {
        return tugas;
    }
}

class WakilKetua extends PengurusInti {
    private String tugas;

    public WakilKetua(String namaPengurus, String tugas) {
        super(namaPengurus);
        this.tugas = tugas;
    }

    public String getTugas() {
        return tugas;
    }
}

class Sekretaris extends PengurusInti {
    private String tugas;

    public Sekretaris(String namaPengurus, String tugas) {
        super(namaPengurus);
        this.tugas = tugas;
    }

    public String getTugas() {
        return tugas;
    }
}

class Bendahara extends PengurusInti {
    private String tugas;

    public Bendahara(String namaPengurus, String tugas) {
        super(namaPengurus);
        this.tugas = tugas;
    }

    public String getTugas() {
        return tugas;
    }
}

class KoordinatorBidang extends Unhas{
    private String namaKoordinator;

    public KoordinatorBidang (String namaKoordinator){
        this.namaKoordinator= namaKoordinator;
    }

    public String getNamaKoordinator() {
        return namaKoordinator;
    }
}

class Kemahasiswaan extends KoordinatorBidang {
    private String tugas;

    public Kemahasiswaan(String namaKoordinator, String tugas) {
        super(namaKoordinator);
        this.tugas = tugas;
    }

    public String getTugas() {
        return tugas;
    }
}

class Akademik extends KoordinatorBidang {
    private String tugas;

    public Akademik(String namaKoordinator, String tugas) {
        super(namaKoordinator);
        this.tugas = tugas;
    }

    public String getTugas() {
        return tugas;
    }
}

class Staff extends Unhas{
    private String namaStaff;

    public Staff (String namaStaff){
        this.namaStaff= namaStaff;
    }

    public String getNamaStaff() {
        return namaStaff;
    }
}

class Administrasi extends Staff {
    private String tugas;

    public Administrasi(String namaStaff, String tugas) {
        super(namaStaff);
        this.tugas = tugas;
    }

    public String getTugas() {
        return tugas;
    }
}

class Perpustakaan extends Staff {
    private String tugas;

    public Perpustakaan(String namaStaff, String tugas) {
        super(namaStaff);
        this.tugas = tugas;
    }

    public String getTugas() {
        return tugas;
    }
}