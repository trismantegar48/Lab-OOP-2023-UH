public class Main {
    public static void main(String[] args) {
        Smartphone samsung = new Smartphone();
        Car avanza= new Car();
        GermanShepherd dog4 = new GermanShepherd();
        
        samsung.move();
        avanza.move();
        dog4.move();
        System.out.println(dog4.getPosition());
        dog4.describe();
    }
}