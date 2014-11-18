package Facade;

/**
 * Tuner
 */
public class Tuner {
    Amplifier amplifier;
    double frequency;

    void setOutput(Amplifier amplifier){
        this.amplifier = amplifier;
    }


    void on(){
        System.out.println("Tuner ON.");
    }

    void off(){
        System.out.println("Tuner OFF.");
    }

    void setAM(){
        System.out.println("Tuner set to AM.");
    }

    void setFM(){
        System.out.println("Tuner set to FM.");
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
        System.out.println("Tuner set to frequency " + frequency + "kHz");
    }
}
