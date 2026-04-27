package ship_modules;


abstract class ShipPart {

  protected String name;
  protected int maxHp;
  protected int currentHp;
  
  //weight is meassured in tonnes
  //e.g. USS Enterprise = 4 500 000 t 
  protected double weight;
  



  public ShipPart(String name, int maxHp) {
    this.name = name;
    this.maxHp = maxHp;
    this.currentHp = this.maxHp;
  }


  public void takeDamage(int damage){

    this.currentHp = this.currentHp - damage;  
    if (this.currentHp < 0 )
      this.currentHp=0;

  }

  //sensor: identifies if ShipPart is destroyed --> if destroyed it should give info for the player to know#
  //later implementing into the BattleEngine to register destreoyed shipparts
  public boolean isDestroyed(){
    if (this.currentHp == 0)      
      return true;
    else return false;
  }

  public String getName(){
    return this.name;
  }

  //maybe switcvhing back to return int with simple mechanics to just retrive HP
  //might be important for the BattleEngine idk :)
  public void getCurrentHp(){
     System.out.println(this.name + "->Current HP: "+this.currentHp);
  }

  public double getHealthRatio(){
     double hpPercentage = this.currentHp/this.maxHp;
     return hpPercentage;
  }

  public int getMaxHp(){
    return this.maxHp;
  }
}
