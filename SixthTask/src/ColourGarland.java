public class ColourGarland extends Garland {

    public ColourGarland(int lenght) {
        lamps = new ColourLamp[lenght];
        for (int i = 0; i < lenght; i++) {
            lamps[i] = new ColourLamp();
            switch (i % 4) {
                case 0:
                    ((ColourLamp) lamps[i]).setColor(Color.Red);
                    break;
                case 1:
                    ((ColourLamp) lamps[i]).setColor(Color.Yellow);
                    break;
                case 2:
                    ((ColourLamp) lamps[i]).setColor(Color.Green);
                    break;
                case 3:
                    ((ColourLamp) lamps[i]).setColor(Color.Blue);
                    break;

            }
        }
    }


}

