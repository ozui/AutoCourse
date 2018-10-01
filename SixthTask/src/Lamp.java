public class Lamp {
    private boolean stateEnabled;

    public Lamp() {
        stateEnabled = false;
    }

    public boolean isStateEnabled() {
        return stateEnabled;
    }

    public void setStateEnabled(boolean stateEnabled) {
        this.stateEnabled = stateEnabled;
    }

    @Override
    public String toString() {
        return isStateEnabled() ? "Lamp is on" : "Lamp is off";
    }
}
