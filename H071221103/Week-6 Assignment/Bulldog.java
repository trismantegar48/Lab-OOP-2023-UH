class Bulldog extends Dog{
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void describe() {
        System.out.println("Anjing yang memiliki tubuh yang kecil");
    }
    @Override
    public void move() {
        this.position += 1;
        System.out.println ("Bulldog bergeser ke : " + position);
        
    }
}