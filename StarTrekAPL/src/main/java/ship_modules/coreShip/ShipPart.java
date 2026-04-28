package ship_modules.coreShip;


public abstract class ShipPart {

  protected String name;
  protected final double maxHullIntegrity;
  protected double currentHullIntegrity;

  
  //weight is meassured in tonnes
  //e.g. USS Enterprise = 4 500 000 t 
  protected double weight;
  



  public ShipPart(String name, double maxHullIntegrity) {
    this.name = name;
    this.maxHullIntegrity = maxHullIntegrity;
    this.currentHullIntegrity = maxHullIntegrity;
  }
 


  //trakeDamge DamageEngigne should be an Interface later Implement it
  public void takeDamage(double damage){

    this.currentHullIntegrity = this.currentHullIntegrity - damage;  
    if (this.currentHullIntegrity < 0 )
      this.currentHullIntegrity=0;

  }

  //sensor: identifies if ShipPart is destroyed --> if destroyed it should give info for the player to know#
  //later implementing into the BattleEngine to register destreoyed shipparts
  public boolean isDestroyed(){
    if (this.currentHullIntegrity == 0)      
      return true;
    else return false;
  }

  public String getName(){
    return this.name;
  }

  //maybe switcvhing back to return int with simple mechanics to just retrive HP
  //might be important for the BattleEngine idk :)
  public void getcurrentHullIntegrity(){
     System.out.println(this.name + "->Current HP: "+this.currentHullIntegrity);
  }

  public double getHealthRatio(){
     double hpPercentage = this.currentHullIntegrity/this.maxHullIntegrity;
     return hpPercentage;
  }

  public double getmaxHullIntegrity(){
    return this.maxHullIntegrity;
  }
}
