import java.util.ArrayList;
import java.util.List;

public class Store {
    private String nama;
    private List<Product> products;
    
    public String getNama() {
        return nama;
    }
    
    public Store(String nama) {
        this.nama = nama;
        products = new ArrayList<>();
    }
    
    public void tambahProduct(Product product) {
        products.add(product);
    }
    
    public void tampilkanProducts() {
        System.out.println("Daftar Produk:");
        int x= 0;
        for (Product product : products) {
            x++;
            System.out.println(x + "." +product.getNama() + " - $" + product.getPrice() + " | Stock: " + product.getStok());
        }
        System.out.println("0. Keluar");
    }
    
    public void beliProduct(User user, Product product) {
        if (user.getBalance() >= product.getPrice() && product.getStok() > 0) {
            user.setBalance(user.getBalance() - product.getPrice());
            product.sell();
            System.out.println(user.getNama() + " Berhasil membeli " + product.getNama() + " dengan harga $" + product.getPrice() + ".");
            System.out.println("|--------------------------------------------------------------|");
            if (product.getStok() == 0) {
                products.remove(product);
            }
        } else {
            System.out.println("Uang tidak mencukupi!!!");
        }
    }
    
}