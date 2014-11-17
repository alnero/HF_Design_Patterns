package Command;

import Command.Commands.GarageDoorOpenCommand;
import Command.Commands.LightOnCommand;
import Command.Receivers.GarageDoor;
import Command.Receivers.Light;

/**
 * Test drive of simple remote control
 */
public class SimpleRemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        GarageDoor door = new GarageDoor("");

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
    }
}
