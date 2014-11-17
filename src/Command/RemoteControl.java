package Command;

import Command.Commands.*;

/**
 * Heavy duty remote control
 */
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private static final int NUMBER_OF_SLOTS = 7;

    public RemoteControl() {
        onCommands = new Command[NUMBER_OF_SLOTS];
        offCommands = new Command[NUMBER_OF_SLOTS];

        Command noCommand = new NoCommand();
        for(int i = 0; i < NUMBER_OF_SLOTS; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        undoCommand = onCommands[slot];
        this.onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot){
        undoCommand = offCommands[slot];
        this.offCommands[slot].execute();
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Remote Control \n");
        for(int i = 0; i < NUMBER_OF_SLOTS; i++){
            sb.append("[" + i +"]");
            sb.append("  " + onCommands[i].getClass().getSimpleName());
            sb.append("\t" + offCommands[i].getClass().getSimpleName());
            sb.append("\n");
        }
        sb.append("[undo]" + undoCommand.getClass().getSimpleName());
        return  sb.toString();
    }
}
