package no4;

class Cuboid {
    double height;
    double lenght;
    double widht;
    
    double getVolume(){
        return lenght*widht*height;
    }
public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        cuboid.height= 30;
        cuboid.lenght= 10;
        cuboid.widht= 15;

        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
}
