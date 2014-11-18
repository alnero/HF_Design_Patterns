package Facade;

/**
 * Theater lights
 */
public class TheaterLights {
    int illumination;

    void on(){
        System.out.println("Lights ON.");
    }

    void off(){
        System.out.println("Lights OFF.");
    }

    void dim(int illumination){
        this.illumination = illumination;
        System.out.println("DIM the lights to " + illumination + "%");
    }
}
