class Valorant {
    String nameChar;
    String skillChar;
    int jumlahArmor;

    public String getname() {
        return nameChar;
    }

    public String getskill() {
        return skillChar;
    }

    public int getjumlah() {
        return jumlahArmor;
    }

}

public class No1 {
    public static void main(String[] args) {
        Valorant valo = new Valorant();

        valo.nameChar= "Sage";
        valo.skillChar = "Healing orb";
        valo.jumlahArmor = 1000;

        System.out.println("Nama karakternya adalah " + valo.getname());
        System.out.println("Skill yang digunakan " + valo.getskill());
        System.out.println("Jumlah armor yang digunakan ialah sebanyak " + valo.getjumlah() + " armor");
    }
}