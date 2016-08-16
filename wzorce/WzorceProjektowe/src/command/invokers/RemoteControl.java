package command.invokers;

import command.commands.Command;
import command.commands.NoCommand;

import java.util.stream.IntStream;

/**
 * Created by tomek on 16.08.16.
 */
public class RemoteControl {

    public static final int NUM_COMMANDS = 7;
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[NUM_COMMANDS];
        offCommands = new Command[NUM_COMMANDS];
        Command noCommand = new NoCommand();

        IntStream.range(0, NUM_COMMANDS)
            .forEach(idx -> {
                onCommands[idx] = noCommand;
                offCommands[idx] = noCommand;
            });

        /*for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }*/
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < NUM_COMMANDS; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
            + " " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
