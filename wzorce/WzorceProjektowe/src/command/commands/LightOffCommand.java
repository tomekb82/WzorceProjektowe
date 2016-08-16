package command.commands;

import command.receivers.Light;

/**
 * Created by tomek on 15.08.16.
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
