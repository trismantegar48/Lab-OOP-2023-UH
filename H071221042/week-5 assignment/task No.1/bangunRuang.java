class bangunRuang {
    double volume;
}

class kubus extends bangunRuang {
    int rusuk;

    public kubus(int rusuk) {
        this.rusuk = rusuk;
    }

    public double hitungVolume() {
        volume = rusuk * rusuk * rusuk;
        return volume;
    }
}

class balok extends bangunRuang {
    int panjang;
    int lebar;
    int tinggi;

    public balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        volume = panjang * lebar * tinggi;
        return volume;
    }
}

class bola extends bangunRuang {
    int jariJari;

    public bola(int jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungVolume() {
        int r= jariJari*jariJari*jariJari;
        volume = r*22/7*4/3;
        return volume;
    }
}

class tabung extends bangunRuang {
    int tinggi;
    int r;

    public tabung(int tinggi, int r) {
        this.tinggi = tinggi;
        this.r = r;
    }

    public double hitungVolume() {
        volume = 3.14 * r * r * tinggi;
        return volume;
    }
}
