package it.unisannio.logic;

import javax.ejb.Stateless;

@Stateless
public class ConverterLogic implements ConverterLogicLocal {
    private final double convFactor = 1.087;
    @Override
    public double convertToDollar(double euro) {
        System.out.println("sono qui"+euro*convFactor);
        return euro*convFactor;
    }
}
