package Command.Commands;

import Command.Receivers.GarageDoor;

/**
 * Command to close the garage door
 */
public class GarageDoorCloseCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
        garageDoor.lightOff();
    }

    @Override
    public void undo() {

    }
}
