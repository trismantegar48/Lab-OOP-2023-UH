public class Susu2 {
    public static void main(String[] args) {
        Susu susu1 = new Susu("Susu Sapi", 15000, "Full Cream");
        Susu susu2 = new Susu("Susu Kambing", 20000, "Murni", 10);

        susu1.tampilkanInfo();
        susu2.tampilkanInfo();

        System.out.println("Stok " + susu1.toString() + " : " + susu1.getStok());
        System.out.println("Stok " + susu2.toString() + " : " + susu2.getStok());

        susu1.tambahStok(5);
        susu2.tambahStok(10);

        System.out.println("Stok " + susu1.toString() + " : " + susu1.getStok());
        System.out.println("Stok " + susu2.toString() + " : " + susu2.getStok());

        susu1.setHarga(18000);
        System.out.println("Harga " + susu1.toString() + " setelah diubah: " + susu1.getHarga());
    }
}
