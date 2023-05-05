class siberianHusky extends Dog {
    public siberianHusky(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        setPosition(getPosition() + 2);
        System.out.println("Siberian Husky bergerak ke kenan sebanyak " + getPosition() + "kali");
    }

    @Override
    void describe() {
        System.out.println("Mirip serigala ggs");
    }
}