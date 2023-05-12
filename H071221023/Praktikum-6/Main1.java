public class Main1 {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull(0, 58);
        pitbull.describe();
        pitbull.move();
        System.out.println("Posisi Pitbull :" + pitbull.position);

        SiberianHusky siberianhusky = new SiberianHusky(0, 38);
        siberianhusky.describe();
        siberianhusky.move();
        System.out.println("Posisi Siberian Husky :" + siberianhusky.position);

        Bulldog bulldog = new Bulldog(0, 40);
        bulldog.describe();
        bulldog.move();
        System.out.println("Posisi Bulldog :" + bulldog.position);

        GermanShepherd germanshepherd = new GermanShepherd(0, 37);
        germanshepherd.describe();
        germanshepherd.move();
        System.out.println("Posisi German Shepherd:" + germanshepherd.position);
    }
}