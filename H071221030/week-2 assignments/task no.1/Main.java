class Main {
    public static void main(String[] args) {
        Greeks zeus = new Greeks();
        zeus.name = "Zeus";
        zeus.known = "God of Thunder";
        zeus.power = 100;
        zeus.iq = 100;
        System.out.println(zeus.getName());
        System.out.println("Power: " + zeus.getPower());
        System.out.println("Intelligent: " + zeus.getIQ());
        System.out.println();

        Greeks hermes = new Greeks();
        hermes.name = "Hermes";
        hermes.known = "Herald of the Gods";
        hermes.power = 80;
        hermes.iq = 70;
        System.out.println(hermes.getName());
        System.out.println("Power: " + hermes.getPower());
        System.out.println("Intelligent: " + hermes.getIQ());
        System.out.println();

        Greeks poseidon = new Greeks();
        poseidon.name = "Poseidon";
        poseidon.known = "God of the Sea";
        poseidon.power = 85;
        poseidon.iq = 60;
        System.out.println(poseidon.getName());
        System.out.println("Power: " + poseidon.getPower());
        System.out.println("Intelligent: " + poseidon.getIQ());
    }
}