package Command.simpleremote;

public class SimpleRemoteControl {
    Command solt;

    public  SimpleRemoteControl() {
        
    }

    public void setCommand(Command command) {
        this.solt = command;
    }

    public void buttonPressed() {
        solt.execute();
    }
}
