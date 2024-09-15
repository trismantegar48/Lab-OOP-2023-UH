import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        User user = new User("Zero-Two", 4000);
        Store store = new Store("Toko Franxx");
        store.addProduct(new Product("Oli Mesin Franxx", 500, 14));
        store.addProduct(new Product("Bensin Franxx", 750, 6));
        store.addProduct(new Product("Franxx Baru", "3k", 1));
        boolean sementaraTransaksi = true; 

        while (sementaraTransaksi) {
        System.out.println("-------------MONEHHHHH From Papa-------------");
        System.out.println(user.getName());
        System.out.println(user.getBalance());
        System.out.println("---------------------------------------------");

        System.out.println("Welcome anak-anak ku di " + store.getName());
        store.listProduct();
        System.out.println("0. Keluar");
        System.out.print("> ");
        int beli = input.nextInt();

        if (beli > 0 && beli <= store.products.size()) {
            System.out.println("---------------------------------------------");
            System.out.println("Apakah anda yakin ingin membeli: ");
            Product product = store.products.get(beli - 1);
            System.out.println(product.getName() + " , dengan harga $" + product.getPrice());
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("> ");
            int konfirmasi = input.nextInt();
            if (konfirmasi == 1) {
                store.prosesTransaksi(user, product);
            } else {
                System.out.println("Pembelian dibatalkan");
            }

            System.out.println("Lanjutkan Transaksi?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            System.out.print("> ");
            int oke = input.nextInt();
            if (oke == 2) {
                sementaraTransaksi = false;
                System.out.println("Terima kasih telah berbelanja di sini");
            }
        }  else if (beli == 0) {
            sementaraTransaksi = false;
            System.out.println("Terima kasih sudah berbelanja");
        } else {
            System.out.println("Input tidak valid");
        }
        System.out.println("----------------");
        }
    }
}