public class User {
    private String nama;
    private int balance;

    public User(String nama, int balance){
        this.nama = nama;
        this.balance = balance;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
