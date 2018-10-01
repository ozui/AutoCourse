public class SimpleGarland extends Garland {
    public SimpleGarland(int lenght) {
        lamps = new Lamp[lenght];
        for (int i = 0; i < lenght; i++) {
            lamps[i] = new Lamp();
        }
    }
}

