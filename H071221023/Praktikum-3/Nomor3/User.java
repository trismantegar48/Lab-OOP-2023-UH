public class User {
        private String name;
        private int balance;
    
        
        public User(String name, int balance) {
            this.name = name;
            this.balance = balance;
        }
        
        public String getName() {
            return name;
        }
        
        public void setBalance(int balance) {
            this.balance = balance;
        }
    
        public int getBalance() {
            return balance;
        }
    }

