public class Main {
    public static void main(String[] args) {
        DeadOrAlive lisa = new DeadOrAlive("Lisa Hamilton", 3, 4, 3);
        DeadOrAlive leifang = new DeadOrAlive("Lei Fang", 1, 4, 5);

        lisa.showStats();
        leifang.showStats();

        lisa.upgradeDefense();
        lisa.upgradePower();
        lisa.upgradeTechnique();
        System.out.println();

        lisa.showStats();
        leifang.showStats();

        lisa.voli(leifang);
        System.out.println();
        lisa.showStats();

        lisa.upgradeTechnique();
        System.out.println();
        lisa.showStats();
    }
}