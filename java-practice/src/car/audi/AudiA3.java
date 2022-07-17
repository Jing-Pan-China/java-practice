package car.audi;

import constants.Color;

public class AudiA3 extends Audi {

    @Override
    public String getModel() {
        return "A3";
    }

    @Override
    public Color getColorAsEnum() {
        return Color.BLACK;
    }
}
