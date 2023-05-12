class SiberianHusky extends Dog{

    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void move (){
        this.position += 2;
    }

    @Override
    void describe() {
        System.out.println("bulunya tebal dan panjang. Warnanya pun cukup beragam, seperti abu-abu kehitaman, hitam, belang, putih, dan cokelat kemerahan");
    }
}
