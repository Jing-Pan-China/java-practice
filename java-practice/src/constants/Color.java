package constants;

public enum Color {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    PURPLE,
    BROWN,
    BLACK,
    WHITE;

    public String formatColor() {
        String input = this.toString(); // BLUE, YELLOW, RED, BLACK, all uppercase like defined in enum class.
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase(); // First letter uppercase, remainder of the string lowercase.
    }
}
