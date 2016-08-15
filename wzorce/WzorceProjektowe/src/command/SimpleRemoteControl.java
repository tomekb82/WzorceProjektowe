package command;

/**
 * Created by tomek on 15.08.16.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){};

    public void setCommand(Command command){
        this.slot = command;
    }

    public void buttonPressed(){
        slot.execute();
    }
}
