package Command.Commands;

import Command.Receivers.CeilingFan;

/**
 * Command to start the ceiling fan
 */
public class CeilingFanMediumCommand implements Command{
    CeilingFan fan;
    int previousSpeed;

    public CeilingFanMediumCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.medium();
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
