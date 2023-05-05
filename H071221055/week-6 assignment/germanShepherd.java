class germanShepherd extends Dog {
    public germanShepherd(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        setPosition(getPosition() + 3);
        System.out.println("GermanShepherd bergerak ke kenan sebanyak " + getPosition() + "kali");
    }

    @Override
    void describe() {
        System.out.println("Anjing Polisi");
    }
}