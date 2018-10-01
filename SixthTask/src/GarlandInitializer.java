import java.util.Calendar;
import java.util.Scanner;

public class GarlandInitializer {
    public static final int MINUTE = Calendar.getInstance().get(Calendar.MINUTE);

    public static void main(String[] args) {
        System.out.print("Current minute: " + MINUTE + "\n");
        System.out.print("Enter garland lamps number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ColourGarland colourGarland = new ColourGarland(num);
        System.out.println("COLOUR GARLAND STATE\n"+colourGarland.getGarlandState());
        SimpleGarland simpleGarland = new SimpleGarland(num);
        System.out.println("GARLAND STATE\n"+simpleGarland.getGarlandState());
    }
}
