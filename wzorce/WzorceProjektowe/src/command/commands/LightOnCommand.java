package command.commands;

import command.receivers.Light;

/**
 * Created by tomek on 15.08.16.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
