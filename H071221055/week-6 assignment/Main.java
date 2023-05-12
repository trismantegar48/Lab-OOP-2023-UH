public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        Bulldog bulldog = new Bulldog(10, 5);
        bulldog.move();
        bulldog.describe();
        System.out.println("-------------------------------------------------");

        Smartphone smartphone = new Smartphone(12, "Iphone 11");
        smartphone.move();
        System.out.println("-------------------------------------------------");

        Car car = new Car(10,"Grey",1200);
        car.move();
        System.out.println("-------------------------------------------------");
    }
}
