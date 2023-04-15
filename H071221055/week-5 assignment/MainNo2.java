class MainNo2{
    public static void main(String[] args) {
        System.out.println("----------------------------------");
        System.out.println("\t--JABATAN--\t");
        System.out.println("----------------------------------");
        Ketua ketua = new Ketua("Rehan", 24, "Perempuan","Ketua");
        System.out.println("Nama\t\t: " + ketua.getName());
        System.out.println("umur\t\t: " + ketua.getAge());
        System.out.println("Gender\t\t: " + ketua.getGender());
        System.out.println("Jabatan\t\t: " + ketua.getJabatan());
        System.out.println("----------------------------------");
        Sekretaris sekre = new Sekretaris("Afif", 25, "Laki-laki", "Sekretaris");
        System.out.println("Nama\t\t: " + sekre.getName());
        System.out.println("umur\t\t: " + sekre.getAge());
        System.out.println("Gender\t\t: " + sekre.getGender());
        System.out.println("Jabatan\t\t: " + sekre.getJabatan());
        
        System.out.println("----------------------------------");
        System.out.println("\t--BIDANG DAN STAF--\t");
        System.out.println("----------------------------------");
        Pubdok pubdok = new Pubdok("Dipsi", 20, "Perempuan","Pubdok");
        System.out.println("Nama\t\t: "+ pubdok.getName());
        System.out.println("umur\t\t: "+ pubdok.getAge());
        System.out.println("Gender\t\t: " + pubdok.getGender() );
        System.out.println("Bidang dan staf\t: " +pubdok.getBidangstaf());
        System.out.println("----------------------------------");
        Keamanan keamanan = new Keamanan("Trisman", 30, "Laki-laki", "Keamanan");
        System.out.println("Nama\t\t: " + keamanan.getName());
        System.out.println("umur\t\t: " + keamanan.getAge());
        System.out.println("Gender\t\t: " + keamanan.getGender());
        System.out.println("Bidang dan staf\t: " + keamanan.getBidangstaf());
    }
}