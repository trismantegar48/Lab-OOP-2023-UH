class GermanShepherd extends Dog{
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move (){
        this.position += 3;
    }
    @Override
    void describe() {
        System.out.println("Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid. Bobot antara 34-43kg. Tinggi kisaran 57,5-62,5 cm. Hidung umumnya berwarna hitam kadang ada juga berwarna biru atau merah hati");
    }
}

