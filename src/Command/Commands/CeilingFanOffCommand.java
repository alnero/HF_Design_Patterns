package Command.Commands;

import Command.Receivers.CeilingFan;

/**
 * Command to turn the ceiling fan off
 */
public class CeilingFanOffCommand implements Command{
    CeilingFan fan;
    int previousSpeed;

    public CeilingFanOffCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.off();
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
