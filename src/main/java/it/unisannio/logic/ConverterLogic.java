package it.unisannio.logic;

import javax.ejb.Stateless;

@Stateless
public class ConverterLogic implements ConverterLogicLocal {
    private final float convFactor = 1.087f;
    @Override
    public double convertToDollar(double euro) {
        return euro*convFactor;
    }
}
