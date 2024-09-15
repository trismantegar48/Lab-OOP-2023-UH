public class Mainsisfo {
    public static void main(String[] args) {
        Ketum ketua = new Ketum("Trisman Tegar Wiratama", "H071221023");
        Sekretaris sekretaris = new Sekretaris("A.Afif Alhaq", "H071221064");
        Bendahara bendahara = new Bendahara("Waliuddin", "H071221018");
        ketua.showKetum();
        sekretaris.showSekretaris();
        bendahara.showBendahara();
        System.out.println();

        Pengaderan peng1 = new Pengaderan("Al Qadri", "H071221052", true);
        Pengaderan peng2 = new Pengaderan("Muh.Taufan Sandi", "H071221029", false);
        Pengaderan peng3 = new Pengaderan("Kelvin", "H071221043", false);
        Pengaderan peng4 = new Pengaderan("M. Fahdel Putra", "H071221051", false);
        System.out.println("==== " + "Koordinator " + peng1.divisi + " ====");
        System.out.println("Nama    : " + peng1.getNama());
        System.out.println("NIM     : " + peng1.getNim());
        System.out.println("Anggota :");
        System.out.println("1. " + peng2.getNama() + " (" + peng2.getNim() + ")");
        System.out.println("2. " + peng3.getNama() + " (" + peng3.getNim() + ")");
        System.out.println("3. " + peng4.getNama() + " (" + peng4.getNim() + ")");
        System.out.println();

        Eksternal eksternal1 = new Eksternal("Andi Ahmad Salwan", "H071221048", true);
        Eksternal eksternal2 = new Eksternal("Minhajul Yusri", "H071221006", false);
        Eksternal eksternal3 = new Eksternal("Andi Ahmad Alim Arzaq", "H071221027", false);
        Eksternal eksternal4 = new Eksternal("Muh Ilham Maulana", "H071221035", false);
        System.out.println("==== " + "Koordinator " + eksternal1.divisi + " ====");
        System.out.println("Nama    : " + eksternal1.getNama());
        System.out.println("NIM     : " + eksternal1.getNim());
        System.out.println("Anggota :");
        System.out.println("1. " + eksternal2.getNama() + " (" + eksternal2.getNim() + ")");
        System.out.println("2. " + eksternal3.getNama() + " (" + eksternal3.getNim() + ")");
        System.out.println("3. " + eksternal4.getNama() + " (" + eksternal4.getNim() + ")");
        System.out.println();

        Kesekretariatan kesek1 = new Kesekretariatan("Muh Azka Zufirman", "H071221032", true);
        Kesekretariatan kesek2 = new Kesekretariatan("Surya Agus Nanro", "H071221038", false);
        Kesekretariatan kesek3 = new Kesekretariatan("Laode Fahmi Hidayat", "H071221022", false);
        Kesekretariatan kesek4 = new Kesekretariatan("Alif Rezky Maulana", "H071221014", false);
        System.out.println("==== " + "Koordinator " + kesek1.divisi + " ====");
        System.out.println("Nama    : " + kesek1.getNama());
        System.out.println("NIM     : " + kesek1.getNim());
        System.out.println("Anggota :");
        System.out.println("1. " + kesek2.getNama() + " (" + kesek2.getNim() + ")");
        System.out.println("2. " + kesek3.getNama() + " (" + kesek3.getNim() + ")");
        System.out.println("3. " + kesek4.getNama() + " (" + kesek4.getNim() + ")");
        System.out.println();

        Kerohanian Kerohanian1 = new Kerohanian("Aan Syawaluddin", "H071221031", true);
        Kerohanian Kerohanian2 = new Kerohanian("Rasyad Bimasatya", "H071221024", false);
        Kerohanian Kerohanian3 = new Kerohanian("Andi Ahmad Fail", "H071221026", false);
        Kerohanian Kerohanian4 = new Kerohanian("A. Syaifullah Aksa", "H071221017", false);
        System.out.println("==== " + "Koordinator " + Kerohanian1.divisi + " ====");
        System.out.println("Nama    : " + Kerohanian1.getNama());
        System.out.println("NIM     : " + Kerohanian1.getNim());
        System.out.println("Anggota :");
        System.out.println("1. " + Kerohanian2.getNama() + " (" + Kerohanian2.getNim() + ")");
        System.out.println("2. " + Kerohanian3.getNama() + " (" + Kerohanian3.getNim() + ")");
        System.out.println("3. " + Kerohanian4.getNama() + " (" + Kerohanian4.getNim() + ")");
        System.out.println();
    }
}