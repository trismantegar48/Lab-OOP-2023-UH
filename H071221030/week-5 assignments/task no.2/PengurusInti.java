class PengurusInti extends Sisfo {
    String jabatan;
}

class Ketum extends PengurusInti {
    public Ketum(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.jabatan = "Ketua Umum Organisasi";
    }

    public void showKetum() {
        System.out.println("==== " + this.jabatan + " ====");
        System.out.println("Nama : " + this.getNama());
        System.out.println("Nim  : " + this.getNim());
    }
}

class Sekretaris extends PengurusInti {
    public Sekretaris(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.jabatan = "Sekretaris Umum Organisasi";
    }

    public void showSekretaris() {
        System.out.println("==== " + this.jabatan + " ====");
        System.out.println("Nama : " + this.getNama());
        System.out.println("Nim  : " + this.getNim());
    }
}

class Bendahara extends PengurusInti {
    public Bendahara(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        this.jabatan = "Bendahara Umum Organisasi";
    }

    public void showBendahara() {
        System.out.println("==== " + this.jabatan + " ====");
        System.out.println("Nama : " + this.getNama());
        System.out.println("Nim  : " + this.getNim());
    }
}