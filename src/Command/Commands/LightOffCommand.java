package Command.Commands;

import Command.Receivers.Light;

/**
 * Command object to turn the light off
 */
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }

    @Override
    public void undo() {
        light.lightOn();
    }
}
