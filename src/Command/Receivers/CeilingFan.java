package Command.Receivers;

/**
 * Ceiling fan
 */
public class CeilingFan extends Receiver {
    int currentSpeed;
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MID = 2;
    public static final int HIGH = 3;

    public CeilingFan(String description) {
        super(description);
    }

    public void low(){
        currentSpeed = LOW;
        System.out.println(description + " ceiling fan speed set to: " + this.currentSpeed);
    }

    public void medium(){
        currentSpeed = MID;
        System.out.println(description + " ceiling fan speed set to: " + this.currentSpeed);
    }

    public void high(){
        currentSpeed = HIGH;
        System.out.println(description + " ceiling fan speed set to: " + this.currentSpeed);
    }

    public void off(){
        currentSpeed = OFF;
        System.out.println(description + " ceiling fan is OFF.");
    }

    public int getSpeed(){
        return currentSpeed;
    }



}
