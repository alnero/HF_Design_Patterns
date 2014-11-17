package Command.Commands;

import Command.Receivers.Stereo;

/**
 * Turn on stereo to play CD at mid volume.
 */
public class StereoOnWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(9);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
