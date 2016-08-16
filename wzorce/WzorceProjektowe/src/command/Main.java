package command;

import command.commands.*;
import command.invokers.MacroCommand;
import command.invokers.RemoteControl;
import command.invokers.SimpleRemoteControl;
import command.receivers.Light;
import command.receivers.Stereo;

/**
 * Created by tomek on 15.08.16.
 */
public class Main {

    public static void main(String[] args) {

        /*------------- simple remote control ------------------- */
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light l = new Light("Salon");
        LightOnCommand lightCommand = new LightOnCommand(l);

        remote.setCommand(lightCommand);
        remote.buttonPressed();

        /*------------- complex remote control ------------------- */
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff =
                new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2,stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        /* -------- macro command ----------- */
        Light light = new Light("Living Room");
        Stereo stereo2 = new Stereo("Living Room");
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo2);
        Command[] partyOn = { lightOn, stereoOn};
        Command[] partyOff = { lightOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        System.out.println(remoteControl);
        System.out.println("--- Macro command On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Macro command Off---");
        remoteControl.offButtonWasPushed(0);

    }
}
