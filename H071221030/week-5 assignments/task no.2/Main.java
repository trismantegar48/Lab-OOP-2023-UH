public class Main {
    public static void main(String[] args) {
        Ketum ketua = new Ketum("Fail Santo Paulus", "H071221020");
        Sekretaris sekretaris = new Sekretaris("Karina Zahra Kamila", "H071221032");
        Bendahara bendahara = new Bendahara("Alisha Grace Bethony", "H071221040");
        ketua.showKetum();
        sekretaris.showSekretaris();
        bendahara.showBendahara();
        System.out.println();

        Humas hub1 = new Humas("Kelvin Leonardo Hamengkubowono", "H071221015", true);
        Humas hub2 = new Humas("Charles Rasyad Aveiro", "H071221004", false);
        Humas hub3 = new Humas("Zoel Alexander", "H071221102", false);
        Humas hub4 = new Humas("Zacharie Abduwali Muse", "H071221105", false);
        System.out.println("==== " + "Koordinator " + hub1.divisi + " ====");
        System.out.println("Nama    : " + hub1.getNama());
        System.out.println("NIM     : " + hub1.getNim());
        System.out.println("Anggota :");
        System.out.println("1. " + hub2.getNama() + " (" + hub2.getNim() + ")");
        System.out.println("2. " + hub3.getNama() + " (" + hub3.getNim() + ")");
        System.out.println("3. " + hub4.getNama() + " (" + hub4.getNim() + ")");
        System.out.println();

        Perlengkapan perleng1 = new Perlengkapan("Christopher Adnan Putra", "H071221001", true);
        Perlengkapan perleng2 = new Perlengkapan("Alfred Mario Situmorang", "H071221028", false);
        Perlengkapan perleng3 = new Perlengkapan("Charles Nabil Suryakencana", "H071221009", false);
        Perlengkapan perleng4 = new Perlengkapan("Christian Azka Demitrius", "H071221045", false);
        System.out.println("==== " + "Koordinator " + perleng1.divisi + " ====");
        System.out.println("Nama    : " + perleng1.getNama());
        System.out.println("NIM     : " + perleng1.getNim());
        System.out.println("Anggota :");
        System.out.println("1. " + perleng2.getNama() + " (" + perleng2.getNim() + ")");
        System.out.println("2. " + perleng3.getNama() + " (" + perleng3.getNim() + ")");
        System.out.println("3. " + perleng4.getNama() + " (" + perleng4.getNim() + ")");
        System.out.println();

        Kesekretariatan kesek1 = new Kesekretariatan("Minhajul Kendrick", "H071221069", true);
        Kesekretariatan kesek2 = new Kesekretariatan("Dewina Miselia Zahra", "H071221027", false);
        Kesekretariatan kesek3 = new Kesekretariatan("Rezqia Adelia Grace", "H071221080", false);
        Kesekretariatan kesek4 = new Kesekretariatan("Syifa Miselia Bethony", "H071221088", false);
        System.out.println("==== " + "Koordinator " + kesek1.divisi + " ====");
        System.out.println("Nama    : " + kesek1.getNama());
        System.out.println("NIM     : " + kesek1.getNim());
        System.out.println("Anggota :");
        System.out.println("1. " + kesek2.getNama() + " (" + kesek2.getNim() + ")");
        System.out.println("2. " + kesek3.getNama() + " (" + kesek3.getNim() + ")");
        System.out.println("3. " + kesek4.getNama() + " (" + kesek4.getNim() + ")");
        System.out.println();

        Bumo bumo1 = new Bumo("Mr. Ir. Joseph Joestar S.Th, S.Kom, S.Si, S.Pd, M.Eng", "H071221030", true);
        Bumo bumo2 = new Bumo("Natalie Hasan Jamah", "H071221136", false);
        Bumo bumo3 = new Bumo("Susan Abigail Angelina", "H07122010", false);
        Bumo bumo4 = new Bumo("Azalia Elva Aalifa", "H071221175", false);
        System.out.println("==== " + "Koordinator " + bumo1.divisi + " ====");
        System.out.println("Nama    : " + bumo1.getNama());
        System.out.println("NIM     : " + bumo1.getNim());
        System.out.println("Anggota :");
        System.out.println("1. " + bumo2.getNama() + " (" + bumo2.getNim() + ")");
        System.out.println("2. " + bumo3.getNama() + " (" + bumo3.getNim() + ")");
        System.out.println("3. " + bumo4.getNama() + " (" + bumo4.getNim() + ")");
        System.out.println();
    }
}