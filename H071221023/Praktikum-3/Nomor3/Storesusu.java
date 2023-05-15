import java.util.ArrayList;
import java.util.Scanner;

public class Storesusu {
    private String name;                    //untuk menyimpan nama toko
    private ArrayList<Product> products;    //Daftar produk disimpan dalam sebuah ArrayList dari kelas Product
    
    public String getName() {   //digunakan untuk mengambil nama toko
        return name;
    }

    public Storesusu(String name) {         //constructor untuk membuat objek dari kelas
        this.name = name;                        //Constructor ini menerima parameter name yang digunakan untuk mengisi atribut name pada objek yang dibuat, serta menginisialisasi products dengan ArrayList kosong.
        products = new ArrayList<Product>();
    }

    
    public void tambahProduct(Product product) {  //digunakan untuk menambahkan produk baru ke daftar produk di toko
        products.add(product);
    }

    public void daftarProduct() {           //digunakan untuk menampilkan daftar produk yang tersedia di toko. Method ini akan menampilkan produk yang memiliki stok lebih dari 0
        System.out.println("Daftar Produk:");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getStock() > 0) {
                System.out.println((i+1) + ". " + product.getName() + " - $" + product.getPrice() + " | Stok " + product.getStock());
            }
        }
    }
    
    public void tranksaksi(User user, int productIndex) {   //digunakan untuk melakukan transaksi pembelian produk. 
        Product product = products.get(productIndex);
      
        if (product.getStock() == 0) {
            System.out.println("Maaf, produk ini sudah habis");
            return;
        }
        if (user.getBalance() < product.getPrice()) {
            System.out.println("Maaf, saldo anda tidak cukup untuk membeli produk ini");
            return;
        }

       //konfirmasi pembelian 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Apakah anda yakin ingin membeli:");
        System.out.println(product.getName() + ", dengan harga $" + product.getPrice());
        System.out.println("1. Konfirmasi \n2. Batal");
        System.out.print("> ");
        String konfirmasi = scanner.nextLine();
        if (konfirmasi.equalsIgnoreCase("1")) {
            user.setBalance(user.getBalance() - product.getPrice());
            product.reduceStock();
            System.out.println(user.getName() + " berhasil membeli " + product.getName() + ".");
        } else {
            System.out.println("Pembelian dibatalkan");
        }
    }
    
}