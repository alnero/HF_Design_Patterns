package Facade;

/**
 * Amplifier
 */
public class Amplifier {
    int volume;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;


    void on(){
        System.out.println("Amplifier ON");
    }

    void off(){
        System.out.println("Amplifier OFF");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Amplifier volume set to " + volume);
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
        System.out.println("Amplifier input set to Tuner");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Amplifier input set to DVD");
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
        System.out.println("Amplifier input set to CD");
    }

    void setSurroundSound() {
        System.out.println("Amplifier set to SURROUND sound");
    }


    void setStereoSound() {
        System.out.println("Amplifier set to STEREO sound");
    }
}
