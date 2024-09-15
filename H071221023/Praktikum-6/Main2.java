public class Main2 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(10000000, "Iphone 11");
        smartphone.move();
        System.out.println("Nama Barang : " + smartphone.brand);
        System.out.println("Harga : " +smartphone.price);

        Car car = new Car(5, "Red", 225);
        car.move();
        System.out.println("Total gigi pada mobil : " + car.totalForwardGear);
        System.out.println("Warna Mobil : " + car.color);
        System.out.println("Top Speed : " +car.maxSpeed);
    }
}
