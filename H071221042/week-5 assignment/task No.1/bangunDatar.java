class bangunDatar{
    int luas;
}

class persegi extends bangunDatar {
    int sisi;

    public persegi (int sisi){
        this.sisi= sisi;
    }

    public int hitungLuas(){
        luas = sisi*sisi;
        return luas;
    }
}

class persegiPanjang extends bangunDatar {
    int panjang;
    int lebar;

    public persegiPanjang (int panjang, int lebar){
        this.panjang= panjang;
        this.lebar= lebar;
    }
    
    public int hitungLuas() {
        luas= panjang * lebar;
        return luas;

    }
}

class lingkaran extends bangunDatar {
    int jariJari;
    
    public lingkaran(int jariJari){
        this.jariJari=jariJari;
    }

    public int hitugLuas() {
        luas = (22/7) * (jariJari*jariJari);
        return luas;
    }
}

class segitiga extends bangunDatar {
    int alas;
    int tinggi;

    public segitiga (int alas, int tinggi){
        this.alas= alas;
        this.tinggi= tinggi;
    }
    
    public int hitungLuas() {
        luas = (alas * tinggi)/2;
        return luas;
    }
}

class trapesium extends bangunDatar {
    int a, b, t;

    public trapesium(int a, int b, int t){
        this.a= a;
        this.b= b;
        this.t= t;
    }

    public int hitungLuas() {
        luas = (a+b)*t/2;
        return luas;
    }
}