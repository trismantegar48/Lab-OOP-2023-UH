public class Main {
  public static void main(String[] args) {
    //obj
    EldenRing player1 = new EldenRing("Hero", 50, 75);
    player1.status();
    EldenRing Skeleton = new EldenRing("Archer Skeletal", 30, 12);
    EldenRing dragon = new EldenRing("Fire Dragon",500, 200);
    System.out.println("--------------------------------------------------");
    System.out.println("--------------------------------------------------");
    System.out.println("--------------------------------------------------");
  
    

    //Method 1
    player1.lvlUp();
    player1.att(Skeleton);
    System.out.println("Player 1 runes: "+ player1.getRune());

    System.out.println("");
    //Method 2
    player1.att(dragon);
    System.out.println("Player 1 runes: " + player1.getRune());
    player1.att(Skeleton);
    player1.att(Skeleton);
    player1.att(Skeleton);
    player1.att(Skeleton);
    player1.att(Skeleton);
    player1.att(Skeleton);
    player1.att(Skeleton);
    player1.att(Skeleton);
    player1.att(Skeleton);
    player1.att(Skeleton);
    System.out.println("Player 1 runes: " + player1.getRune());
    
    player1.lvlUp();
    player1.status();

  }
}