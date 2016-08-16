package command.invokers;

import command.commands.Command;

import java.util.Arrays;

/**
 * Created by tomek on 16.08.16.
 */
public class MacroCommand implements Command {

    Command[] commands;
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        Arrays.stream(commands).forEach(o -> o.execute());
    }
}
