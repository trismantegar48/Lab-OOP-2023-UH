abstract class Dog implements Moveable{
    protected int position;
    protected int averageLenght;

    abstract public void move();
    abstract void describe();
    
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLenght() {
        return averageLenght;
    }

    public void setAverageLenght(int averageLenght) {
        this.averageLenght = averageLenght;
    }

    public Dog(int position, int averageLenght) {
        this.position = position;
        this.averageLenght = averageLenght;
    }
}

