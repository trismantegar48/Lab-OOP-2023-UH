public class Main {
    public static void main(String[] args) {

        //objek
        Player player1 = new Player("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);

        //method
        player2.setAttackPower(35);
        player1.getDamage(player2);  //method ini akan mengurangi health player2 berdasarkan nilai attack player1 dan defense player2.

        //untuk menampilkan status terbaru kedua pemain setelah terjadi pengurangan health akibat serangan
        player1.status();
        player2.status();
    }
}
