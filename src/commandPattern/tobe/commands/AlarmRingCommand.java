package commandPattern.tobe.commands;

import commandPattern.tobe.Alarm;
import commandPattern.tobe.commander.Command;

public class AlarmRingCommand implements Command {
    private Alarm alarm;

    public AlarmRingCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}
