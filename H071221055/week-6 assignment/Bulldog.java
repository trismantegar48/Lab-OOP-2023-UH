class Bulldog extends Dog {
    public Bulldog(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        setPosition(getPosition() + 1);
        System.out.println("Bulldog bergerak ke kenan sebanyak " + getPosition() + " kali");
    }

    @Override
    void describe() {
        System.out.println("Tampang menyeramkan tapi baik hati");
    }
}