public class Product {
    String name;
    int price, stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        this.price = Integer.parseInt(price.toLowerCase().replace("k", "000"));
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void jualProduk() {
        if (this.stock > 0) {
            this.stock -= 1;
        }
    }
}
