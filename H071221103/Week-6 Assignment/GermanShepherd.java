class GermanShepherd extends Dog{
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }
    
    @Override
    void describe() {
        System.out.println("Anjing yang mirip dengan serigala");
    }
    @Override
    public void move() {
        this.position += 3;
        System.out.println ("German Shepherd bergeser ke : " + position);
        
    }
}