class Pitbull extends Dog {
    public Pitbull(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        setPosition(getPosition() + 3);
        System.out.println("Pitbull bergerak ke kenan sebanyak " + getPosition() + "kali");
    }

    @Override
    void describe() {
        System.out.println("Galak");
    }
}