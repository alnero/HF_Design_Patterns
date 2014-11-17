package Command.Receivers;

/**
 * Light
 */
public class Light extends Receiver{

    public Light(String description) {
        super(description);
    }

    public void lightOn(){
        System.out.println(description + " light is ON.");
    }

    public void lightOff(){
        System.out.println(description + " light is OFF.");
    }
}
