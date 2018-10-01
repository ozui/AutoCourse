public class ColourLamp extends Lamp {
    private Color color;

    public String getColor() {
        return color.toString();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " color is " + getColor();
    }
}
