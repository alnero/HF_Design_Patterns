package Command;

import Command.Commands.*;
import Command.Receivers.CeilingFan;
import Command.Receivers.Light;
import Command.Receivers.Stereo;

/**
 * Trying macro commands
 */
public class MacroCommandTestDrive {
    public static void main(String[] args) {
        Light light = new Light("Living room");
        CeilingFan fan = new CeilingFan("Living room");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand lightOn = new LightOnCommand(light);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(fan);
        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightOff = new LightOffCommand(light);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(fan);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);

        MacroCommand partyOn = new MacroCommand(lightOn, ceilingFanMedium, stereoOnWithCD);
        MacroCommand partyOff = new MacroCommand(lightOff, ceilingFanOff, stereoOffCommand);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, partyOn, partyOff);

        System.out.println("--- Party mode ON --- ");
        remote.onButtonWasPressed(0);
        System.out.println("\n--- Party mode OFF ---");
        remote.offButtonWasPressed(0);
        System.out.println("\n--- Party mode UNDO ---");
        remote.undoButtonWasPressed();

    }
}
