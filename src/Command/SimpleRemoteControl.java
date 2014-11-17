package Command;

import Command.Commands.Command;

/**
 * Simple remote control with one slot
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
