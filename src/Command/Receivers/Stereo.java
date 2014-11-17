package Command.Receivers;

/**
 * Stereo
 */
public class Stereo extends Receiver {

    public Stereo(String description) {
        super(description);
    }

    public void on(){
        System.out.println(description + " Stereo is ON.");
    }

    public void off(){
        System.out.println(description + " Stereo is OFF.");
    }

    public void setCD(){
        System.out.println(description + " Stereo is set to play CD.");
    }

    public void setDVD(){
        System.out.println(description + " Stereo is set to play DVD.");
    }

    public void setRadio(){
        System.out.println(description + " Stereo is set to play Radio.");
    }

    public void setVolume(int volume){
        System.out.println(description + " Stereo volume is set to: " + volume);
    }
}
