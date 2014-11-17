package Command.Commands;

import Command.Receivers.CeilingFan;

/**
 * Command to start the ceiling fan
 */
public class CeilingFanHighCommand implements Command{
    CeilingFan fan;
    int previousSpeed;

    public CeilingFanHighCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.high();
    }

    @Override
    public void undo() {
        switch (previousSpeed){
            case CeilingFan.HIGH:
                fan.high();
                break;
            case CeilingFan.MID:
                fan.medium();
                break;
            case CeilingFan.LOW:
                fan.low();
                break;
            case CeilingFan.OFF:
                fan.off();
                break;
        }
    }
}
