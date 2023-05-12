class Pitbull extends Dog{
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void describe() {
        System.out.println("Anjing galak");
    }
    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbull bergeser ke : " + position);
        
    }
}