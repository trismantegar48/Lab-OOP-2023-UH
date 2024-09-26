class Player {
    private String name;
    private int hp;
    private int attackPower;
    public int defense;

    //constructor
    public Player(String name, int attackPower, int defense) {
        this.name = name;
        this.hp = 100;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    //constructor
    public Player(String name, int defense) {
        this.name = name;
        this.hp = 100;
        this.attackPower = 0;
        this.defense = defense;
    }

    // digunakan untuk mengurangi health point pemain yang diserang oleh enemy, 
    //dengan menghitung selisih antara attackPower enemy dan defense pemain yang diserang.
    public void getDamage(Player enemy) {
        hp = hp - Math.abs(enemy.getAttackPower() - defense);
    }

    //digunakan untuk menampilkan status terbaru dari pemain, yaitu nama, hp, defense, dan attackPower
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    //digunakan untuk mengatur nilai dari attackPower
    void setAttackPower(int attackPower) {
        this.attackPower = attackPower ;
    }

    //digunakan untuk mengambil nilai dari attackPower
    public int getAttackPower() { 
        return attackPower;
    }

    //digunakan untuk mengatur nilai dari defense
    void setDefense(int defense) {
        this.defense = defense;

    }

    //digunakan untuk mengambil nilai dari defense
    int getDefense(int defense) {
        return defense;
    }

    //digunakan untuk mengatur nilai dari name
    void setName(String name) {
        this.name = name;
    }
}