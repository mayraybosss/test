package HomeWork3.color;

public class Color {

    private static final int RED = 1;
    private static final int ORANGE = 2;
    private static final int YELLOW = 3;
    private static final int GREEN = 4;
    private static final int DARKBLUE = 5;
    private static final int BLUE = 6;
    private static final int PURPLE = 7;

    private int color;


    public Color(int color) {
        this.color = color;
    }

    public int getNumber() {
        return color;
    }

    public String getName() {
        String result = "";
        switch (color) {
            case Color.RED:
                result = "RED";
            break;
            case Color.ORANGE:
                result = "ORANGE";
            break;
            case Color.YELLOW:
                result = "YELLOW";
            break;
            case Color.GREEN:
                result = "GREEN";
            break;
            case Color.DARKBLUE:
                result = "DARKBLUE";
            break;
            case Color.BLUE:
                result = "BLUE";
            break;
            case Color.PURPLE:
                result = "PURPLE";
            break;
            default:
                result = "UNKNOWN COLOR";
            break;
        }
        return result;
    }
}
