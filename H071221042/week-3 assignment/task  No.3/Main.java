import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //obj user
        User user1 = new User("KELVIN", 5000);
        System.out.println("----------CARD----------");
        System.out.println(user1.getNama());
        System.out.println(user1.getBalance());
        System.out.println("------------------------");

        //obj product
        Product product1 = new Product("LENOVO LEGION 5 PRO", 3000, 1);
        Product product2 = new Product("ASUS VIVOBOOK", 2200, 1);
        Product product3 = new Product("Tas Laptop", "1k", 1);

        //obj store
        Store store1 = new Store("Smart Media Komputer");
        store1.tambahProduct(product1);
        store1.tambahProduct(product2);
        store1.tambahProduct(product3);

        
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di "+store1.getNama());
        while (true){
            store1.tampilkanProducts();
            System.out.print(">");
            int pilihan= input.nextInt();
            if (pilihan==1){
                System.out.println("Apakah anda yakin ingin membeli "+ product1.getNama()+ " dengan harga $"+ product1.getPrice()+ " (ya/tidak)");
                System.out.print(">");
                String konfirmasi = input.next();
                if (konfirmasi.equalsIgnoreCase("ya")){
                    store1.beliProduct(user1, product1);
                    System.out.println("Ingin melanjutkan pembelian? (ya/tidak)");
                    String lanjut = input.next();
                    if (lanjut.equalsIgnoreCase("ya")){
                    } else if (lanjut.equalsIgnoreCase("tidak")){
                        break;
                    }
                } else if (konfirmasi.equalsIgnoreCase("tidak")) {
                }

            } else if (pilihan==2){
                System.out.println("Apakah anda yakin ingin membeli " + product2.getNama() + " dengan harga &"+ product2.getPrice()+ " (ya/tidak)");
                System.out.print(">");
                String konfirmasi = input.next();
                if (konfirmasi.equalsIgnoreCase("ya")) {
                    store1.beliProduct(user1, product2);
                    System.out.println("Ingin melanjutkan pembelian? (ya/tidak)");
                    String lanjut = input.next();
                    if (lanjut.equalsIgnoreCase("ya")) {
                    } else if (lanjut.equalsIgnoreCase("tidak")) {
                        break;
                    }
                } else if (konfirmasi.equalsIgnoreCase("tidak")) {
                }

            } else if (pilihan==3){
                System.out.println("Apakah anda yakin ingin membeli " + product3.getNama() + " dengan harga $"+ product3.getPrice()+ " (ya/tidak)");
                System.out.print(">");
                String konfirmasi = input.next();
                if (konfirmasi.equalsIgnoreCase("ya")) {
                    store1.beliProduct(user1, product3);
                    System.out.println("Ingin melanjutkan pembelian? (ya/tidak)");
                    String lanjut = input.next();
                    if (lanjut.equalsIgnoreCase("ya")) {
                    } else if (lanjut.equalsIgnoreCase("tidak")) {
                        break;
                    }
                }else if (konfirmasi.equalsIgnoreCase("tidak")){
                }
            }else if (pilihan == 0){
                break;
            }else{
                System.out.println("Barang yang ingin di beli tidak tersedia");
            }
        }
    }
}