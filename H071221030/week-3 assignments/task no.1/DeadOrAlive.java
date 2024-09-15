public class DeadOrAlive {
    String nama;
    int power, technique, defense, xp;

    public DeadOrAlive() {}

    public DeadOrAlive(String nama, Integer power, Integer technique, Integer defense) {
        this.nama = nama;
        this.power = power;
        this.technique = technique;
        this.defense = defense;
        this.xp = 10000;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setTechnique(int technique) {
        this.technique = technique;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setXP(int xp) {
        this.xp = xp;
    }

    public String getNama() {
        return this.nama;
    }

    public int getPower() {
        return this.power;
    }

    public int getTechnique() {
        return this.technique;
    }

    public int getDefense() {
        return this.defense;
    }

    public int getXP() {
        return this.xp;
    }

    public void upgradePower() {
        if (this.xp < 5000) {
            System.out.println("Insufficient XP");
        } else {
            this.setPower(this.getPower() + 1);
            this.setXP(this.getXP() - 5000);
            System.out.println("Power upgraded (Currently " + this.getPower() + ")");
        }
    }

    public void upgradeTechnique() {
        if (this.xp < 3000) {
            System.out.println("Insufficient XP");
        } else {
            this.setTechnique(this.getTechnique() + 1);
            this.setXP(this.getXP() - 3000);
            System.out.println("Technique upgraded (Currently " + this.getTechnique() + ")");
        }
    }

    public void upgradeDefense() {
        if (this.xp < 4000) {
            System.out.println("Insufficient XP");
        } else {
            this.setDefense(this.getDefense() + 1);;
            this.setXP(this.getXP() - 4000);
            System.out.println("Defense upgraded (Currently " + this.getDefense() + ")");
        }
    }

    public void showStats() {
        System.out.println("========Character Status========");
        System.out.println("Name       : " + this.getNama());
        System.out.println("Power      : " + this.getPower());
        System.out.println("Technique  : " + this.getTechnique());
        System.out.println("Defense    : " + this.getDefense());
        System.out.println("XP         : " + this.getXP());
        System.out.println();
    }

    public double getAverage() {
        return (this.getDefense() + this.getPower() + this.getTechnique())/3;
    }

    public void voli(DeadOrAlive rival) {
        if (this.getAverage() > rival.getAverage()) {
            this.setXP(this.getXP() + 4000);
            System.out.println("YOU WON!!!!");
            System.out.println("You Get 4000xp");
        } else if (this.getAverage() == rival.getAverage()) {
            this.setXP(this.getXP() + 1500);
            System.out.println("DRAW");
            System.out.println("You Get 1500xp");
        } else {
            this.setXP(this.getXP() + 500);
            System.out.println("You Lose!!");
            System.out.println("You Get 500xp");
        }
    }
}