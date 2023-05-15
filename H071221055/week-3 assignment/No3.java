import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private int balance;

    public String getName() {
        return name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

}

class Product {
    private String name;
    private int price;
    private int stock;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        this.stock = stock;

        if (price.contains("k")) {
            price = price.replace("k", "");
            this.price = Integer.parseInt(price) * 1000;
        } else {
            this.price = Integer.parseInt(price);
        }
    }

    public void sell() {
        stock--;
    }

}

class Store {
    private String name;
    private ArrayList<Product> listProduct;
    static Scanner scanner;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Store(String name) {
        this.name = name;
        listProduct = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public void listProduct() {
        System.out.println("Daftar Produk");
        int x = 0;
        for (Product product : listProduct) {
            x++;
            if (product.getStock()>0) {
                System.out.println(x + "." + product.getName() + " - " + "Rp" + product.getPrice() + "|" + product.getStock());
            }
        }
    }

    public void transaksi(User user, int productIndex){
        Product product = listProduct.get(productIndex);
        if (product.getStock() == 0) {
            listProduct.remove(product);
            System.out.println("Produk telah habis");
            return;
        }
        if(user.getBalance() < product.getPrice()){
            System.out.println("uang tidak mencukupi");
            return;
        }

        scanner = new Scanner(System.in);
        System.out.println("Apakah anda yakin ingin membeli : ");
        System.out.println(product.getName() + " dengan harga Rp." + product.getPrice());
        System.out.println("1.Konfirmasi \n2.Batal");
        System.out.print(">");
        int konfirmasi = scanner.nextInt();
        if(konfirmasi == 1){
            user.setBalance(user.getBalance() - product.getPrice());
            product.sell();
            System.out.println(user.getName()+ " berhasil membeli " + product.getName());
        }else{
            System.out.println("pembelian dibatalkan");
        }

    }
}

public class No3 {
    public static void main(String[] args) {
        User user = new User("arniraihanah", 100000);

        Store store = new Store("Cafetaria");
        store.addProduct(new Product("Sushi Roll", 45000, 2));
        store.addProduct(new Product("Ramen", "60k", 3));
        store.addProduct(new Product("Yakiniku", "30k", 2));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di " + store.getName());
        while (true) {
            System.out.println("---------- CARD -----------");
            System.out.println(user.getName());
            System.out.println(user.getBalance());
            System.out.println("---------------------------");
            store.listProduct();
            System.out.println("0. Keluar");
            System.out.print("> ");
            int pilihan = scanner.nextInt()-1;
            if (pilihan >= 0){
                store.transaksi(user,pilihan);
                
            } else{
                break;
            }

            System.out.println("------------------------------");
            System.out.println("Lanjutkan Transaksi?");
            System.out.println("1.Iya \n2.Tidak");
            System.out.print("> ");

            int confirm = scanner.nextInt();
            if (confirm == 2) {
                break;
            }
        }
        System.out.println("Terima kasih,Selamat datang kembali");
        scanner.close();
    }
}
