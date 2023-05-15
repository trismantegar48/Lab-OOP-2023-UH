class Unhas {
    String nama;
    int umur;
    String gender;

    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return umur;
    }

    public void setAge(int umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class PengurusInti extends Unhas {
    String jabatan;

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

class Ketua extends PengurusInti {
    public Ketua(String nama, int umur, String gender,String jabatan) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = jabatan;
    }
}

class Sekretaris extends PengurusInti {
    public Sekretaris(String nama, int umur, String gender, String jabatan) {
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.jabatan = jabatan;
    }
}

class Koordinator extends Unhas{
    String Bidangstaf;

    public String getBidangstaf() {
        return Bidangstaf;
    }

    public void setBidangstaf(String bidangstaf) {
        Bidangstaf = bidangstaf;
    }
}

class Pubdok extends Koordinator{
    public Pubdok(String nama,int umur,String gender,String Bidangstaf){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.Bidangstaf = Bidangstaf;
    }
}

class Keamanan extends Koordinator {
    public Keamanan(String nama,int umur,String gender,String Bidangstaf){
        this.nama = nama;
        this.umur = umur;
        this.gender = gender;
        this.Bidangstaf = Bidangstaf;
    }
}