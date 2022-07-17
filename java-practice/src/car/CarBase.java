package car;

import constants.Color;

public abstract class CarBase implements Car
{

    @Override
    public String getName() {
        return getBrand() + " " + getModel(); // model = Audi, brand = A3 -> Audi A3
    }

    @Override
    public String getColor() {
        return getColorAsEnum().formatColor();
    }

    // The protected keywords mean the methods 'getBrand' and 'getModel' are only available inside classes that inherit from 'CarBase'.
    protected abstract String getBrand();
    protected abstract String getModel();
    protected abstract Color getColorAsEnum();
}
