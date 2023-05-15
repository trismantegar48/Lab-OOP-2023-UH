abstract class Dog implements Move {
    protected int position;
    protected int averageLenght;

    public int getPosition() {
        return position;
    }

    public int getAverageLenght() {
        return averageLenght;
    }

    abstract void describe();
    abstract public void move();
}