class Pitbull extends Dog{

    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }
    @Override
    void move (){
        this.position += 3;
    }
    @Override
    void describe() {
        System.out.println("Pitbull memiliki rahang yang kuat sehingga jika ia menggigit, akan sangat sulit melepasnya karena gigitannya bersifat mengunci.");
    }
}