package ship_modules;

import ship_modules.coreShip.ShipPart;

public class WeaponSystem extends ShipPart {

  private final String phaserPos;
  private double damagePotential = 100;

  public WeaponSystem(String weaponModel, double maxHpWeapon, String pos) {
    super(weaponModel, maxHpWeapon);
    this.phaserPos = pos;
    this.weight = 76000;
  }

  public double damageVaue() {
    return damagePotential;
    // im not sure if this will even work
  }


  //tf i jsut coded BS 100
  public double overloadPhasers(boolean overload) {
    if (overload == true) {
      this.currentHullIntegrity = currentHullIntegrity * 0.95;
      return this.damagePotential * 1.1;
    } else {
      System.out.println("overload False no increase of damagePotential");
      return this.damagePotential;
    }
  }
}
