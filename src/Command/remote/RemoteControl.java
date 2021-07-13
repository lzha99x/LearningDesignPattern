package Command.remote;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int solt, Command onCommand, Command offCommand) {
        onCommands[solt] = onCommand;
        offCommands[solt] = offCommand;
    }
    
    public void onButtonPressed(int solt) {
        onCommands[solt].exectue();
    }

    public void offButtonPressed(int solt) {
        offCommands[solt].exectue();
    }
}
