package Command.Receivers;

/**
 * Garage door
 */
public class GarageDoor extends Receiver{

    public GarageDoor(String description) {
        super(description);
    }

    public void up(){
        System.out.println("Garage door is UP.");
    }

    public void down(){
        System.out.println("Garage door is CLOSED.");
    }

    public void stop(){
        System.out.println("Garage door stop.");
    }

    public void lightOn(){
        System.out.println("Garage light is ON.");
    }

    public void lightOff(){
        System.out.println("Garage light is OFF.");
    }
}
