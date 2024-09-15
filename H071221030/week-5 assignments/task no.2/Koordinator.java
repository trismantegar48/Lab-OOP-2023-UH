class Koordinator extends Sisfo {
    String jabatan;
    String divisi;
    boolean isKoor;

    public String getJabatan() {
        if (isKoor) {
            return "Koordinator";
        } else {
            return "Anggota";
        }
    }
}

class Humas extends Koordinator {
    public Humas(String nama, String nim, boolean isKoor) {
        this.nama = nama;
        this.nim = nim;
        this.divisi = "Hubungan Masyarakat";
        this.jabatan = this.getJabatan();
    }
}

class Perlengkapan extends Koordinator {
    public Perlengkapan(String nama, String nim, boolean isKoor) {
        this.nama = nama;
        this.nim = nim;
        this.divisi = "Perlengkapan";
        this.jabatan = this.getJabatan();
    }
}

class Kesekretariatan extends Koordinator {
    public Kesekretariatan(String nama, String nim, boolean isKoor) {
        this.nama = nama;
        this.nim = nim;
        this.divisi = "Kesekretariatan";
        this.jabatan = this.getJabatan();
    }
}

class Bumo extends Koordinator {
    public Bumo(String nama, String nim, boolean isKoor) {
        this.nama = nama;
        this.nim = nim;
        this.divisi = "Hubungan Masyarakat";
        this.jabatan = this.getJabatan();
    }
}