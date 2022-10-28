package IT_Academy_Tutorial.exercise32.freezingDevices;

import IT_Academy_Tutorial.exercise32.Appliancable;

public abstract class FreezingDevices implements Appliancable {

    private String name;

    public abstract void plugIn();

    public abstract void increaseFrost();

}
