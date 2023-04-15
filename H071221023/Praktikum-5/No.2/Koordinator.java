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

class Pengaderan extends Koordinator {
    public Pengaderan(String nama, String nim, boolean isKoor) {
        this.nama = nama;
        this.nim = nim;
        this.divisi = "Pengaderan";
        this.jabatan = this.getJabatan();
    }
}

class Eksternal extends Koordinator {
    public Eksternal(String nama, String nim, boolean isKoor) {
        this.nama = nama;
        this.nim = nim;
        this.divisi = "Eksternal";
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

class Kerohanian extends Koordinator {
    public Kerohanian(String nama, String nim, boolean isKoor) {
        this.nama = nama;
        this.nim = nim;
        this.divisi = "Kerohanian dan Islam";
        this.jabatan = this.getJabatan();
    }
}