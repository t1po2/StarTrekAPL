package ship_modules;

public class Engine extends ShipPart {

    private double maxThrust;           //Enginepower ?
    private int warpCapability;         //unnecessary --> for later Updates ;)


    
    //
    public Engine(String engineModel,int maxHpEngine,double maxThrust,int warpCapability){
        super(engineModel,maxHpEngine);
        this.maxThrust = maxThrust;
        this.warpCapability = warpCapability;

    }

    

    
}
