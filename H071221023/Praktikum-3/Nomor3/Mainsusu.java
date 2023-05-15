import java.util.Scanner;
public class Mainsusu {

    public static void main(String[] args) {                                     //method
    User user = new User("Trisman", 25000);                         //objek
    Storesusu store = new Storesusu("TOKO SUSU FRESH");                     //objek
    
    //produk susu yang dijual ditambahkan ke dalamnya dengan menggunakan method tambahproduct
    store.tambahProduct(new Product("Ultra Milk", "7k", 8));
    store.tambahProduct(new Product("Milo", 10000, 5));
    store.tambahProduct(new Product("Cimory Milk", 5500, 4));
    Scanner scanner = new Scanner(System.in);
    while (true) {
       

        //mencetak informasi kartu
        System.out.println("-----------CARD-----------");
        System.out.println(user.getName());
        System.out.println(user.getBalance());
        System.out.println("--------------------------");
        
        System.out.println("Selamat Datang di " + store.getName());
        store.daftarProduct();
        System.out.println("0. Keluar");
        System.out.print("> ");
        int productIndex = scanner.nextInt() - 1;
        if (productIndex >= 0) {
            store.tranksaksi(user, productIndex);
        } else {
            break;
        }

        System.out.println("--------------------");
        System.out.println("Lanjutkan Tranksaksi? \n1. Iya \n2. Tidak");
        System.out.print("> ");
        String lanjut = scanner.next();
        if (lanjut.equalsIgnoreCase("2")) {
            break;
        }
    }
  
    System.out.println("Terima kasih telah berbelanja di toko kami!");
    scanner.close();
    }   
}

