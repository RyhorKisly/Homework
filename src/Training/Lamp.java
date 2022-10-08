package Training;

public class Lamp {
    public boolean isOn;
    public Lamp () {
        isOn = true;
    }
    public void on() {
        this.isOn = true;
    }
    public void off() {
        this.isOn = false;
    }
    public boolean getState() {
        return isOn;
    }

}
