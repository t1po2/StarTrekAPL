package jmonkeyengine;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;
 
public class Main extends SimpleApplication {
 
    public static void main(String[] args) {
 
        Main app = new Main();
 
        AppSettings settings = new AppSettings(true);
        settings.setTitle("Epic Space Battle ");
        app.setSettings(settings);
 
        app.start();
 
    }
 
    @Override
    public void simpleInitApp() {

        viewPort.setBackgroundColor(ColorRGBA.Black);
        setDisplayFps(true);
        setDisplayStatView(false);

        



 
    }
 
    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }
 
}