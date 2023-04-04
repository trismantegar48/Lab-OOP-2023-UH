class Player {
        private String name;
        private int hp;
        private int attackPower;
        private int defense;

        public Player() {
        }

        public void getDamage(Player enemy) {
            hp = hp - Math.abs(enemy.getAttackPower() - defense);
        }

        public void setAttackPower(int attackPower){
            this.attackPower= attackPower;
        }

        public Player(String name, int attackPower ,int defense ){
            this.name = name;
            this.hp = 100;
            this.defense = defense;
            this.attackPower =attackPower;
        }

        public Player(String name, int defense) {
            this.name = name;
            this.hp = 100;
            this.attackPower = 35;
            this.defense = defense;
        }
        
        public void status() {
            System.out.println(name + " status");
            System.out.println("HP = " + hp);
            System.out.println("Defense = " + defense);
            System.out.println("Attack = " + attackPower + "\n");
        }

        int getAttackPower() {
            return attackPower;
        }
        
}
class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);
    player2.setAttackPower(35);
    player1.getDamage(player2);
    player1.status();
    player2.status();
    }
}