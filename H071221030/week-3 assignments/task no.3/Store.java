import java.util.ArrayList;

public class Store {
    String name;
    ArrayList<Product> products;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void listProduct() {
        if (this.products.size() == 0) {
            System.out.println("Tidak ada barang yang dijual");
        } else {
            System.out.println("Daftar Produk:");
            for (int i = 0; i < this.products.size(); i++) {
                Product product = this.products.get(i);
                System.out.println((i+1) + ". " + product.getName() + " - $" + product.getPrice() + " | Stok " + product.getStock());
            }
        }
    }

    public void prosesTransaksi(User user, Product product) {
        if (user.getBalance() < product.getPrice()) {
            System.out.println("Saldo tidak cukup");
        } else {
            user.balance -= product.getPrice();
            product.jualProduk();
            if (product.getStock() == 0) {
                this.products.remove(product);
            }
            System.out.println(user.getName() + " berhasil membeli " + product.getName() + ".");
        }
    }
}