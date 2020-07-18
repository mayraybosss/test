package HomeWork5;


public enum Color {
    RED(4, "Красный"),
    YELLOW(3, "Желтый"),
    BLUE(2, "Синий"),
    ORANGE(1, "Оранжевый");

    private final int id;
    private final String rusName;

    Color(int id, String rusName) {
        this.id = id;
        this.rusName = rusName;
    }

    public int getId() {
        return id;
    }

    public String getRusName() {
        return rusName;
    }

    public static Color searchForEnum(String nameColor) {
        for(Color c : Color.values()) {
            if (c.name().equalsIgnoreCase(nameColor)) {
                return c;
            }
        }
        return null;
    }
}
