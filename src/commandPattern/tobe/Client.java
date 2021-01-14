package commandPattern.tobe;

import commandPattern.tobe.commander.Command;
import commandPattern.tobe.commands.AlarmRingCommand;
import commandPattern.tobe.commands.LampOnCommand;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);
        Alarm alarm = new Alarm();
        Command alarmRingCommand = new AlarmRingCommand(alarm);

        Button button1 = new Button(lampOnCommand);
        button1.pressed();

        Button button2 = new Button(alarmRingCommand);
        button2.pressed();
        button2.setCommand(lampOnCommand);
        button2.pressed();
    }
}
