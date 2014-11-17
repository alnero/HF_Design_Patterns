package Command.Commands;

import Command.Receivers.GarageDoor;

/**
 * Command object ot open garage door
 */
public class GarageDoorOpenCommand implements Command{
    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }


    @Override
    public void execute() {
        door.lightOn();
        door.up();
    }

    @Override
    public void undo() {

    }
}
