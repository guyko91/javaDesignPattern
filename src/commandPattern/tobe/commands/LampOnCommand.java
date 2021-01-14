package commandPattern.tobe.commands;

import commandPattern.tobe.Lamp;
import commandPattern.tobe.commander.Command;

public class LampOnCommand implements Command {
    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
