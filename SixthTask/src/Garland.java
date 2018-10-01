import java.util.Calendar;

public abstract class Garland {
    protected Lamp[] lamps;

    public Garland() {
    }

    private void setGarlandState() {
        Calendar rightNow = Calendar.getInstance();
        int minute = rightNow.get(Calendar.MINUTE);

        for (int i = 0; i < lamps.length; i++) {
            if (minute % 2 == 0 && i % 2 == 0) {
                lamps[i].setStateEnabled(true);
            }
            if (minute % 2 != 0 && i % 2 != 0) {
                lamps[i].setStateEnabled(true);
            }
        }
    }

    public String getGarlandState() {
        setGarlandState();
        StringBuilder state = new StringBuilder();
        for (int i = 0; i < lamps.length; i++) {
            state.append(i).append(" ").append(lamps[i]).append("\n");
        }
        return state.toString();
    }
}
