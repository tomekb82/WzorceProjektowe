package command.commands;

import command.receivers.Stereo;

/**
 * Created by tomek on 16.08.16.
 */
public class StereoOnCommand implements Command {

    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
    }
}
