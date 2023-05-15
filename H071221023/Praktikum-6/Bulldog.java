class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move (){
        this.position += 1;
    }
    @Override
    void describe() {
        System.out.println("memiliki bentuk mata bulat, hidung berwarna hitam dengan lubang hidung berukuran besar. Sedangkan, untuk telinganya berbentuk seperti bunga mawar yang tipis dan kecil");
    }
}
