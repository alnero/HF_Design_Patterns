package Command;

import Command.Commands.*;
import Command.Receivers.*;

/**
 * Test drive of heavy duty remote control
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(livingRoomCeilingFan);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remote.setCommand(3, garageDoorOpen, garageDoorClose);
        remote.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println(remote + "\n");

        remote.onButtonWasPressed(0);
        remote.onButtonWasPressed(1);
        remote.onButtonWasPressed(2);
        remote.onButtonWasPressed(4);
        remote.offButtonWasPressed(4);
        remote.offButtonWasPressed(2);
        remote.offButtonWasPressed(1);
        remote.offButtonWasPressed(0);
        remote.onButtonWasPressed(3);
        remote.offButtonWasPressed(3);

        System.out.println(remote + "\n");

        remote.onButtonWasPressed(2);
        remote.undoButtonWasPressed();
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
        remote.undoButtonWasPressed();



    }
}
