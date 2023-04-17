public class Product {

        //atribut
        private String name;
        private int price;
        private int stock;
    
        //constructor
        public Product(String name, int price, int stock) {
            this.name = name;
            this.price = price;
            this.stock = stock;
        }
    
        //constructor
        public Product(String name, String price, int stock) {
            this.name = name;
            this.price = convertPrice(price);
            this.stock = stock;
        }
    
        //method
        public String getName() {       //mengembalikan nama produk
            return name;
        }
    
        public int getPrice() {         //mengembalikan harga produk
            return price;
        }
    
        public int getStock() {         //mengembalikan jumlah stok produk
            return stock;
        }
    

        //setiap harga yang berakhiran k akan dikalikan dengan 1000 
        private int convertPrice(String priceString) {
            if (priceString.endsWith("k")) {
                String priceWithoutK = priceString.replace("k", "");
                return Integer.parseInt(priceWithoutK) * 1000;
            } else {
                return Integer.parseInt(priceString);
            }
        }
    
        // digunakan untuk mengurangi jumlah stok produk saat produk tersebut dibeli oleh pelanggan
        public void reduceStock() {         
            stock--;
        }
    }    
