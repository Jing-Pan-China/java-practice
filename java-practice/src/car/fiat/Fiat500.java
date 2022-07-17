package car.fiat;

import constants.Color;

public class Fiat500 extends Fiat {

    @Override
    public String getModel() {
        return "500";
    }

    @Override
    public Color getColorAsEnum() {
        return Color.WHITE;
    }
}
