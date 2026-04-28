package ship_model;
import ship_modules.*;
import java.util.HashMap;
import ship_modules.coreShip.ShipPart;



public class Ship {

    private String nameOfShip;
    Engine engine;
    ShipBody body;
    WeaponSystem phasers;
    HashMap<ShipPos, ShipPart> modulePos;
   

    // how to optimize this fucking line ????
    public Ship(String nameOFShip,String engineName, double maxHpEngine, double maxThrust, String bodyName,double maxHpBody,String phaserName, double maxHpPhasers){
        
        this.nameOfShip = nameOFShip;

        modulePos = new HashMap<>();
        engine = new Engine(engineName, maxHpEngine, maxThrust);
        body = new ShipBody(bodyName,maxHpBody);
        phasers = new WeaponSystem(phaserName,maxHpPhasers);

        modulePos.put(ShipPos.front, phasers);
        modulePos.put(ShipPos.center, body);
        modulePos.put(ShipPos.rear, engine);
    }


    public void takeDamageAtPos(ShipPos position, double damage){

        ShipPart part = modulePos.get(position);
        if ( part != null){
            part.takeDamage(damage);
        } else {
                // when part is destroyed damage should be split onto other parts
        }
    }
    
    public void attackShip(Ship target, ShipPos targetShipPos, double damage){
        target.takeDamageAtPos(targetShipPos, damage);
    }
    


    






    
}
