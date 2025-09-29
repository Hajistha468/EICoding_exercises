package designpatterns.ex1.behavioral;

interface Command {
    void execute();
}

class Light {
    public void on() { System.out.println("Light: ON"); }
    public void off() { System.out.println("Light: OFF"); }
}

class LightOnCommand implements Command {
    private Light light;
    public LightOnCommand(Light l) { light = l; }
    public void execute() { light.on(); }
}

class LightOffCommand implements Command {
    private Light light;
    public LightOffCommand(Light l) { light = l; }
    public void execute() { light.off(); }
}

class RemoteControl {
    private Command command;
    public void setCommand(Command cmd) { command = cmd; }
    public void pressButton() { command.execute(); }
}

public class CommandRemoteControlDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);

        RemoteControl rc = new RemoteControl();
        rc.setCommand(on);
        rc.pressButton();
        rc.setCommand(off);
        rc.pressButton();
    }
}
