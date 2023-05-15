public class EldenRing {
  String tarnish;
  int vigor, strength, rune;
  
  public EldenRing() {
  }
  
  public EldenRing(String tarnish, int vigor, int strength) {
    this.tarnish= tarnish;
    this.vigor= vigor;
    this.strength= strength;
  }
  
  public void att(EldenRing enemy) {
    if (this.getVigor()>enemy.getVigor() && getStrength()>enemy.getStrength()){
      this.setRune(this.getRune() + 100);
    } else if(this.getVigor()<enemy.getVigor() && getStrength()<enemy.getStrength()){
      this.setRune(this.getRune() - this.getRune());
    }
  }

  public void lvlUp() {
    if (this.getRune() >= 1000){
      this.setVigor(this.getVigor()+150);
      this.setStrength(this.getStrength() + 75);
      this.setRune(this.getRune()- 1000);
      System.out.println("LEVEL UP SUCCES");
    } else{
      System.out.println("Not enough runes");
    }

  }
    public String getTarnish() {
      return tarnish;
    }

    public void setTarnish(String tarnish) {
      this.tarnish = tarnish;
    }
    
    public int getVigor() {
      return vigor;
    }
    
    public void setVigor(int vigor) {
      this.vigor = vigor;
    }
    
    public int getStrength() {
      return strength;
    }
    
    public void setStrength(int strength) {
      this.strength = strength;
    }

    public int getRune() {
      return rune;
    }

    public void setRune(int rune) {
      this.rune = rune;
    }

    public void status() {
      System.out.println("Name   : " + this.getTarnish());
      System.out.println("Health : " + this.getVigor());
      System.out.println("Power  : " + this.getStrength());
      System.out.println("Rune   : " + this.getRune());
    }
}