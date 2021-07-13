package Command.simpleremote;

public class RemoteComtrolTest {
    public static void main(String[] args) {
        // 遥控器
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // 厂商类
        Light light = new Light();
        
        // 命令对象
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        remote.setCommand(lightOn);
        remote.buttonPressed();

        remote.setCommand(lightOff);
        remote.buttonPressed();
    }
}
