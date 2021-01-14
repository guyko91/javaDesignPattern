package commandPattern.asis;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button button = new Button(lamp);
        button.pressed();
    }

    public static void main2(String[] args) {
        Lamp lamp = new Lamp();
        Alarm alarm = new Alarm();
        Button2 button2 = new Button2(lamp, alarm);
        button2.setTheMode(Mode.ALARM);
        button2.pressed();
    }
}
