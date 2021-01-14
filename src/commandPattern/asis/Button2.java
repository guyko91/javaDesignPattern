package commandPattern.asis;

public class Button2 {
    private Lamp theLamp;
    private Alarm theAlarm;
    private Mode theMode;

    public Button2(Lamp theLamp, Alarm theAlarm) {
        this.theLamp = theLamp;
        this.theAlarm = theAlarm;
    }

    public void setTheMode(Mode theMode) {
        this.theMode = theMode;
    }

    public void pressed() {
        switch (theMode) {
            case LAMP: theLamp.on(); break;
            case ALARM: theAlarm.start(); break;
        }
    }
}
