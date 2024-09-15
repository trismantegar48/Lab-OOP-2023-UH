public class Main{
    public static void main(String[] args) {
        Ketua ketua = new Ketua("KELVIN", "Mengkoordinir setiap kegiatan");
        System.out.println(ketua.getNamaPengurus() +" Ketua organisasi "+ ketua.getKampus());
        System.out.println("Tugas : " + ketua.getTugas());

        WakilKetua wakilKetua1 = new WakilKetua("Mas Bro", "Membantu tugas ketua");
        System.out.println(wakilKetua1.getNamaPengurus() + " wakil organisasi " + wakilKetua1.getKampus());
        System.out.println("Tugas : " + wakilKetua1.getTugas());

        Sekretaris sekretaris1 = new Sekretaris("Kassandra", "Menyusun rencana kegiatan");
        System.out.println(sekretaris1.getNamaPengurus() + " sekretaris organisasi " + sekretaris1.getKampus());
        System.out.println("Tugas : " + sekretaris1.getTugas());

        Bendahara bendahara1 = new Bendahara("Alexios", "Mencatat keuangan organisasi");
        System.out.println(bendahara1.getNamaPengurus() + " Ketua organisasi " + bendahara1.getKampus());
        System.out.println("Tugas : " + bendahara1.getTugas());
    }
}