package ship_modules;

import ship_modules.coreShip.ShipPart;

public class Engine extends ShipPart {

   // max Thrust is meassured in km/s
   private final double maxThrust=2500000; // Enginepower ?
   // private int warpCapability; //unnecessary --> for later Updates ;)
   private double currentThrust=0;


   // Thrust = F 
   // Acceleration = a = F/m
   // m = mass   


   //
   public Engine(String engineModel, double maxHpEngine) {
      super(engineModel, maxHpEngine);
      this.weight = 40000; // per Engine
   }

   
   public void quarterImpulse(boolean setSpeed) {
      if (setSpeed == true) {
         this.currentThrust = maxThrust * 0.25;
         System.out.println("Set Speed to " + this.currentThrust);
      } else {
         System.out.println("Engine.setSpeed returned False no change of Speed");
      }
   }

   public void halfImpulse(boolean setSpeed) {
      if (setSpeed == true) {
         this.currentThrust = maxThrust * 0.5;
         System.out.println("Set Speed to " + this.currentThrust);
      } else {
         System.out.println("Engine.setSpeed returned False no change of Speed");

      }
   }

   public void threeQuarterImpulse(boolean setSpeed) {
      if (setSpeed == true) {
         this.currentThrust = maxThrust * 0.75;
         System.out.println("Set Speed to " + this.currentThrust);
      } else {
         System.out.println("Engine.setSpeed returned False no change of Speed");

      }
   }

   public void fullImpulse(boolean setSpeed) {
      if (setSpeed == true) {
         this.currentThrust = maxThrust;
         System.out.println("Set Speed to " + this.currentThrust);
      } else {
         System.out.println("Engine.setSpeed returned False no change of Speed");

      }
   }

   public void customImpulse(double factor) {
      if (factor > 1) {
         System.out.println("factor < 1 ");
      } else {
         this.currentThrust = this.currentThrust * factor;
         System.out.println("Set Speed to " + this.currentThrust);
      }
   }

}
